# native-example

## Command that we use to create native image
mvn spring-boot:build-image
In the spring-boot-maven-plugin (see POM file) we have no way of including the Datadog java agent https://github.com/DataDog/dd-trace-java/releases/tag/v0.73.0