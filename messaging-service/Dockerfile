FROM openjdk:11
copy target/messaging-service-0.0.1-SNAPSHOT.jar messaging-service-0.0.1-SNAPSHOT.jar
EXPOSE 8084
ARG CACHEBUST=1
CMD ["java","-jar","/messaging-service-0.0.1-SNAPSHOT.jar"]
