FROM openjdk
COPY src JavaDocker
WORKDIR JavaDocker
RUN mkdir -p bin
RUN javac -d bin ./com/sitrack/project/App.java
WORKDIR bin 
CMD ["java", "com.sitrack.project.App"]