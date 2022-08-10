FROM openjdk:11
MAINTAINER https://github.com/Gustavo053
COPY target/docker-spring-test-0.0.1-SNAPSHOT.jar docker-spring-test-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-spring-test-0.0.1-SNAPSHOT.jar"]