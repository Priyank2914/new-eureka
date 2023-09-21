FROM openjdk
EXPOSE 8761
WORKDIR /app
COPY target/neweureka.jar /app/neweureka.jar
ENTRYPOINT ["java", "-jar" , "neweureka.jar"]