#! /bin/bash
clear
echo Compiling...
java -jar /usr/local/lib/antlr-4.7.2-complete.jar Calculator.g4
javac *.java
echo "" > tests/logs/log.txt
if [ -z "${BASH_ARGV[*]}" ]
then
        echo "No arguments provided. Running all test cases..."
        for i in $(find . -name "*.bc"); do
            echo '###################################################################'
            echo Testing $i...
            OUR_OUTPUT=$(java org.antlr.v4.gui.TestRig Calculator program $i)
            echo $OUR_OUTPUT > tests/logs/$i.out
            BC_OUTPUT=$(bc -l $i)
            echo $BC_OUTPUT > tests/logs/$i.bc.out
            DIFF=$(diff tests/logs/$i.bc.out tests/logs/$i.out)

            if [ -z "$DIFF" ]
            then
                echo GOOD!
            fi

            echo -e "EXPECTED: \n$BC_OUTPUT"
            echo -e "GOT: \n$OUR_OUTPUT"
            echo $DIFF >>tests/logs/log.txt
            read -p "Press ENTER to continue." answer
        done
        else
        for a in ${BASH_ARGV[*]}; do
            OUR_OUTPUT=$(java org.antlr.v4.gui.TestRig Calculator program $a)
            echo $OUR_OUTPUT > tests/logs/$a.out
            BC_OUTPUT=$(bc -l $a)
            echo $BC_OUTPUT > tests/logs/$a.bc.out
            DIFF=$(diff tests/logs/$i.bc.out tests/logs/$a.out)

            if [ -z "$DIFF" ]
            then
                echo GOOD!
            fi

            echo -e "EXPECTED: \n$BC_OUTPUT"
            echo -e "GOT: \n$OUR_OUTPUT"
            echo $DIFF >> tests/logs/log.txt
            read -p "Press ENTER to continue." answer
        done
      fi
      echo '###################################################################'
      echo Testing done!
