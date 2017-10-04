# spring-environment-variables
example project of spring + maven to read environment variables 

## requirements
* maven
* java 8

## usage 
<pre>
mvn package
# on Windows
SET myproperty=ANYVALUE
# on Linux
export myproperty=ANYVALUE 
java -jar target/spring-environment-variables-1.0-SNAPSHOT-jar-with-dependencies.jar
</pre>


You should see the value of the variable "myproperty" being displayed in the console 