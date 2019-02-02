#! /bin/bash
source ~/.bash_profile
for i in $( ls tests); do
        echo item: $i
        OUR_OUTPUT=$(java -jar /usr/local/lib/antlr-4.7.2-complete.jar Calculator.g4; javac *.java; java org.antlr.v4.gui.TestRig Calculator program tests/$i)
        echo $OUR_OUTPUT
        BC_OUTPUT=$(bc -l tests/$i)
        echo $BC_OUTPUT
done
echo Done!
