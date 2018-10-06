#1
FROM gradle:4.6-jdk8-alpine as compile
#2
COPY . /home/source/java
#3
WORKDIR /home/source/java
# Default gradle user is `gradle`. We need to add permission on working directory for gradle to build.
#4
USER root
#5
RUN chown -R gradle /home/source/java
#6
USER gradle
#7
RUN gradle clean build
FROM openjdk:8-jre-alpine
WORKDIR /home/application/java
#8(TODO USE GENERIC NAME FOR JAR)
COPY --from=compile "/home/source/java/build/libs/inventory-0.0.1-SNAPSHOT.jar" .
EXPOSE 8080
#9
ENTRYPOINT [ "java", "-jar", "/home/application/java/inventory-0.0.1-SNAPSHOT.jar"]

#docker build --rm -t coffee-shop/coffee-shop-bff .
#docker run -it --rm -p 8080:3000 -e "REDIS_URL=ZORETA" --name coffee-bff coffee-shop/coffee-shop-bff:latest
