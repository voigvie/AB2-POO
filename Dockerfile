FROM openjdk:19
COPY . . /
WORKDIR /
EXPOSE 8080:8080
RUN javac App.java
CMD ["java","App"]