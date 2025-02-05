find * -name "*.java" > sources.txt
javac @sources.txt
java -cp src avaj.Main scenario.txt