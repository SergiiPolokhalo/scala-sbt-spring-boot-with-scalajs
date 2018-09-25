# A Spring Boot app in Scala with Scala.js with sbt

```
sbt compile
sbt appJS/fastOptJS
cp app/js/target/scala-2.12/app-fastopt.js app/jvm/src/main/resources/static/js/
sbt appJVM/run
```

Navigate to http://localhost:8080
