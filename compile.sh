source ~/.bash_profile
antlr4 Calculator.g4  -o java && javac -Xlint:deprecation -cp java:$CLASSPATH ./java/Driver.java -d java/out
