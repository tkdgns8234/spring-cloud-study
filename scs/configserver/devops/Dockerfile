FROM openjdk:17-jdk

EXPOSE 8080

ARG PROFILE

COPY configserver/build/libs/*.jar app.jar
ENV PROFILE=${PROFILE}

ENTRYPOINT java -jar -Dspring.profiles.active=$PROFILE /app.jar