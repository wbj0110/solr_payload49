name := "solr4payload"

version := "1.0"

scalaVersion := "2.11.2"

EclipseKeys.withSource := true

resolvers ++= Seq(
  "Sonatype Nexus Releases" at "https://oss.sonatype.org/content/repositories/releases",
  "Maven Restlet" at "http://maven.restlet.org",
  "Sonatype Scala Tools" at "https://oss.sonatype.org/content/groups/scala-tools/",
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/repo",
  "Maven.org" at "http://repo2.maven.org/maven2",
  "Conjars.org" at "http://conjars.org/repo",
   Resolver.mavenLocal
)

libraryDependencies ++= Seq(
  "org.apache.solr" % "solr-core" % "4.10.0",
  "org.apache.solr" % "solr-solrj" % "4.10.0"
  )