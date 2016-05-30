name := "akkademy-db-client"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  //"com.typesafe.akka" % "akka-actor_2.11" % "2.3.9",
  //  "com.akkademy-db-java" %% "akkademy-db-java" % "0.0.1-SNAPSHOT",
  "com.akkademy-db-java" %% "akkademy-db-java" % "0.0.1-SNAPSHOT",
  "org.scala-lang.modules" %% "scala-java8-compat" % "0.7.0",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test"
)
