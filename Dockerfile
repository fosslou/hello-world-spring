FROM maven:3.6.0 AS MAVEN_TOOL_CHAIN
COPY pom.xml /tmp/
COPY src /tmp/src/
WORKDIR /tmp/
RUN mvn package


# FROM tomcat
expose 8080
CMD java -jar target/hello-world-spring.jar
# COPY target/hello-world-spring*.war $CATALINA_HOME/webapps/hello-world-spring.war

#HEALTHCHECK --interval=1m --timeout=3s CMD wget --quiet --tries=5 --spider http://localhost:8080/hello-world-spring/ || exit 1
