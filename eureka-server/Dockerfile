FROM java:8-jre
MAINTAINER Wenpd <dingpwen@gmail.com>

ADD ./target/eureka-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-server.jar"]

HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://localhost:8001/eureka/ || exit 1

EXPOSE 8001