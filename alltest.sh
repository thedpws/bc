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
    done
done


