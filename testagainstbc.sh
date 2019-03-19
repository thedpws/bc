alias antlr4='java -jar /usr/local/lib/antlr-4.7.2-complete.jar'

# Compile
antlr4 Calculator.g4 -o java && javac -Xlint:deprecation -cp java:$CLASSPATH ./java/Driver.java -d java/out

mkdir -p out
for dir in $(ls tests)
do
    mkdir -p out/$dir
done

# Run
for testfilepath in $(cd tests && ls ./*/* && cd ..)
do
    echo $testfilepath
    cd java/out
    echo "################# $testfilepath ####################"
    cat ../../tests/$testfilepath
    ouroutput=$(java Driver "../../tests/$testfilepath")
    bcoutput=$(bc -l < "../../tests/$testfilepath")
    cd ../..
    touch out/$testfilepath-ours
    touch out/$testfilepath-bc
    echo "$ouroutput" > out/$testfilepath-ours
    echo "$bcoutput" > out/$testfilepath-bc
    echo "Antlr output: \n$ouroutput"
    echo "BC output: \n$bcoutput"
    read -n 1 -s -r -p "Press any key to continue"
    echo "\n"
done

exit
cd java/out
java Driver "../../$1"
