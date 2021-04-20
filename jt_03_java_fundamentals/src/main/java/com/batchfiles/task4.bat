cd jt_03_java_fundamentals/src/main/java


@echo off
echo "******Compiling and running  the Argument class   from java/subpackage******"
javac -d classes  subpackage/Argument.java
@echo off
echo "Running the Argument main method with this arguments: "Hello there" Ola -c Ciao -d"

java -cp classes subpackage/Argument "Hello there" Ola -c Ciao -d
@echo off
echo "Running the Argument main method with no arguments"
java -cp classes subpackage/Argument
cd subpackage
java -XX:+UseG1GC Argument.java Aici folosesc JVM
java -Xinternalversion


pause
