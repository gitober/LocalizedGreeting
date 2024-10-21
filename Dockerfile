FROM maven:latest

LABEL authors="bober"

ENTRYPOINT ["top", "-b"]

WORKDIR /app

COPY pom.xml /app/

COPY . /app/

RUN mvn package

cmd ["java", "-jar", "target/test.jar"]


