#!groovy
# Jenkinsfile
# Build and test a Maven project

node {
  
  stage'Checkout'
  
  git url: 'https://github.com/jjmerono/pipeline.git'
  
  stage 'Verify'
  
  def mvnHome = tool 'M3'
  sh "${mvnHome}/bin/mvn -B -Dmaven.test.failure.ignore verify"
  step([$class: 'JUnitResultArchiver', testResults:'**/target/foobar/TEST-*.xml'])
  
}