FROM eclipse-temurin:17
	
MAINTAINER com.medico
	
COPY target/hospital-0.0.1-SNAPSHOT.jar hospital-0.0.1-SNAPSHOT.jar
	
ENTRYPOINT ["java","-jar","hospital-0.0.1-SNAPSHOT.jar"]FROM eclipse-temurin:17
	
