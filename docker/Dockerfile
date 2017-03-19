FROM registry.ng.bluemix.net/ibmliberty:microProfile
ARG app_jar
ARG app_name
VOLUME /tmp
ADD $app_jar /app/
ENV APP_JAR $app_jar
ENV VCAP_APPLICATION {"name": "$app_name"}
EXPOSE 8080
CMD "java" "-Djava.security.egd=file:/dev/./urandom" "-Dspring.profiles.active=cloud" "-jar" "/app/$APP_JAR"