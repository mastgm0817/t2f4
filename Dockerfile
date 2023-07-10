FROM openjdk:11
EXPOSE 8080
ADD target/mySpringboot.jar mySpringboot.jar
ENTRYPOINT ["java","-jar","mySpringboot.jar"]