FROM openjdk:18
ADD target/phonebook-docker.jar phonebook-docker.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "phonebook-docker.jar"]