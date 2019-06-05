# API testing with REST-assured and Cucumber (Behavioral Driven Style)


1) create java project / choose SDK 8 OR 10
2) add maven as library 


3) add rest assured maven dependency to pom.xml   https://mvnrepository.com/artifact/com.jayway.restassured/rest-assured/2.9.0
// you can enable the auto import option 


4) add cucumber JVM dependency to pom.xml  https://mvnrepository.com/artifact/info.cukes/cucumber-java/1.2.5


5) Add “Features” package under test/java
                       within Features add a new feature file called “GetPostFeature”


6) Create “Steps” package under test/java

7) Create a class under Steps called “GetPostSteps”

8) //Install JSON server 
//npm install -g json-server
// create a folder  , access the folder and create a json file (touch db.json), then add some data to the file 
// to start json server json-server --watch db.json
9) add scenario (given , when , then …) to the  feature file
10) alt+enter on any one of the features ( “/post” ) to create a step def and call it MyStepDefs (make sure you select java as a File type)
Copy the content of MyStepDefs and paste it in “GetPostSteps”
