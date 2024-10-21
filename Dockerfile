# Use Maven official image to build the project
FROM maven:latest

# Set metadata
LABEL authors="bober"

# Set the working directory inside the container
WORKDIR /app

# Copy the Maven POM file first (for caching dependencies)
COPY pom.xml /app/

# Copy the entire project directory
COPY . /app/

# Run Maven to package the application (this assumes your application is a Maven project)
RUN mvn package

# Set the ENTRYPOINT to run the Java application
ENTRYPOINT ["java", "-jar", "target/test.jar"]
