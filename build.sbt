name := "spark"

version := "0.1"

scalaVersion := "2.11.12"

val sparkVersion = "2.4.3"
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % sparkVersion ,
  "org.apache.spark" %% "spark-sql" % sparkVersion ,
  "org.apache.spark" %% "spark-mllib" % sparkVersion ,
  "org.apache.spark" %% "spark-streaming" % sparkVersion ,
  "org.apache.spark" %% "spark-hive" % sparkVersion,
  "com.maxmind.geoip2" % "geoip2" % "2.5.0",
  "org.anarres.lzo" % "lzo-hadoop" % "1.0.0"
)

libraryDependencies += "org.postgresql" % "postgresql" % "42.2.8"

