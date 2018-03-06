## springbootwebservice
Sample spring boot webservice creation and jQuery client consumption of web service

# Pre-requisites

1. Maven (bin dir should be appeded to PATH)
2. Spring Boot
3. Apache Tomcat

# Run application

- Download the git
- Open command prompt and navigate to SampleSpringWebApp folder
- Run the following command to do maven package
- ``` cmd> mvn clean package ```
- Excute the jar
- ``` cmd> java -jar target/gs-rest-service-0.1.0.jar ```
- It should start the spring boot application and you should be able to access the web service

# Access the webservice

- Open browser
- In address bar type, 
- **Syntax:** *http://<yourserveraddress>[:port]/welcome[?name=<your name>]*
- **Example:** *http://localhost:8080/welcome?name=PSR*

# Using client application

- For your convenience, I have created a sample web service cosuming application using HTML and jQuery
- In SampleSpringWebApp folder, go to client sub-folder
- Open the HelloUser.html in browser
- Upon entering your name in textfield, press tab
- You should be able to see your appended name in below paragraph
