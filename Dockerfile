FROM ubuntu_java

MAINTAINER Anmol_Tuteja

# Set Working Directory
WORKDIR /usr/local

# Copies the files from the source on the host into the container’s set destination
ADD target/calculator-1.0-SNAPSHOT.jar .

# Default container command
ENTRYPOINT ["/usr/bin/java", "-cp", "calculator-1.0-SNAPSHOT.jar", "com/Calculator"] 
