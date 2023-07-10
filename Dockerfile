FROM openjdk:17
EXPOSE 8080
ADD target/mySpringboot.jar mySpringboot.jar
ENTRYPOINT ["java","-jar","mySpringboot.jar"]