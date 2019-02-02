#! /bin/bash
source ~/.bash_profile
clear
for i in $( ls tests/testcases); do
        echo '###################################################################'
        echo Testing $i...
        OUR_OUTPUT=$(java -jar /usr/local/lib/antlr-4.7.2-complete.jar Calculator.g4; javac *.java; java org.antlr.v4.gui.TestRig Calculator program tests/testcases/$i)
        echo $OUR_OUTPUT > tests/logs/$i.out
        BC_OUTPUT=$(bc -l tests/testcases/$i)
        echo $BC_OUTPUT > tests/logs/$i.bc.out
        DIFF=$(diff tests/logs/$i.bc.out tests/logs/$i.out)
        if [ -z "$DIFF" ]
        then
                echo GOOD!
        else
                echo -e "EXPECTED: \n$BC_OUTPUT"
                echo -e "GOT: \n$OUR_OUTPUT"
        fi
        echo $DIFF > tests/logs/log.txt
done

echo '###################################################################'
echo Testing done!
