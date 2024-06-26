FROM maven:latest AS builder

WORKDIR /web-app

COPY . /web-app

RUN mvn clean install


FROM tomcat:latest

RUN rm -rf /usr/local/tomcat/webapps/*

COPY --from=builder /web-app/target/StudentSurvey-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
