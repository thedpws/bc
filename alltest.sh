
# This file runs the parser against the input and prints out the tree. the Pretty-prtints are also outputted as .lisp files

source ~/.bash_profile
cd java/out
# directories
for dir in $(ls -p ../../tests/ | grep ".*/")
do
    echo "\n\t\t########## testing directory $dir #########"
    for file in $(ls ../../tests/$dir)
    do
        echo "\tFile: $dir$file"
        grun Calculator program -tree ../../tests/$dir/$file
        mkdir -p ../../out/$dir
        tree="$(grun Calculator program -tree ../../tests/$dir/$file)"
        echo $(python3 '../../.pp.py' "$tree") > ../../out/$dir$file.lisp
    done
done


