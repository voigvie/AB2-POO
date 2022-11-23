FROM ubuntu:20.04

RUN apt update
RUN apt install default-jdk -y

COPY . .
RUN javac -encoding UTF-8 App.java

CMD ["java", "App"]