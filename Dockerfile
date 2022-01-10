FROM openjdk:8
COPY demo-0.0.1.jar /tmp/demo-0.0.1.jar
WORKDIR /tmp
CMD ["java","-jar","demo-0.0.1.jar"]