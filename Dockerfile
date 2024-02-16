FROM openjdk
LABEL maintainer="abc@gmail.com"
EXPOSE 8081
WORKDIR /app
COPY target/demojenkins.jar /app/demojenkins.jar
ENTRYPOINT ["java","-jar","demojenkins.jar"]