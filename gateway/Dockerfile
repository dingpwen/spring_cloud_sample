FROM java:8-jre
MAINTAINER Wenpd <dingpwen@gmail.com>

ADD ./target/gateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway.jar"]

EXPOSE 5000