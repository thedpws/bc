
# This file compiles the grammar without lexer actions

source ~/.bash_profile
# Compile grammar without lexer actions
cp Calculator.g4 CalculatorNoActions.g4
# Change grammar name
sed -i '' -e 's/Calculator/CalculatorNoActions/g' CalculatorNoActions.g4
# Remove lexer actions
#sed -i '' -e "s/[^\']{.*}/{}/g" CalculatorNoActions.g4
# The regexr regex that works is /[^']{(\n|.)*?}/g
sed -i '' -E -e "s/{[^'](\n|.)*}/{}/g" CalculatorNoActions.g4
sed -i '' -E -e "s/returns.*/ /g" CalculatorNoActions.g4

mkdir -p grammar/out
antlr4 CalculatorNoActions.g4 -o grammar && cd grammar && javac *.java -d ./out && cd out
# Compile


#directories
for dir in $(ls -p ../../tests/ | grep ".*/")
 do
     echo "\n\t\t########## testing directory $dir #########"
     for file in $(ls ../../tests/$dir)
     do
         echo "\tFile: $dir$file"
         grun CalculatorNoActions program -tree ../../tests/$dir/$file
         mkdir -p ../../out/$dir
         tree="$(grun CalculatorNoActions program -tree ../../tests/$dir/$file)"
         echo "$(python3 '../../.pp.py' "$tree")" > ../../out/$dir$file.lisp
     done
 done
 
 
