mkdir -p build
javac -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar -d build src/*.java
java -cp .:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:build TestRunner