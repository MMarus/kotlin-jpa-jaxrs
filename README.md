# kotlin-jpa-jaxrs
Example application in Kotlin using Java EE and JPA (Hibernate and MySQL) and JAXRS (Resteasy)
on wildfly swarm

##How to run
#First create user pis with password pis in your mysql & import init.sql

```
mvn clean install && java -jar ./target/demo-swarm.jar
```

or

```
mvn wildfly-swarm:run
```
