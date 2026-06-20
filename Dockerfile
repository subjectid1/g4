
FROM container-registry.oracle.com/graalvm/native-image:21-muslib AS builder

# Install xargs as part of the findutils package (required by gradlew)
RUN microdnf install findutils
WORKDIR /app
COPY . .
 RUN chmod +x ./gradlew
# Build your application (or compile a Native Image if desired)
RUN ./gradlew nativeCompile -Pstatic
 
 
# Define the command to run your app
#CMD ["java", "-jar", "target/your-app.jar"]