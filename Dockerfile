FROM eclipse-temurin:17
COPY target/sam.jar sam.jar
CMD [ "java","-jar","sam.jar" ]