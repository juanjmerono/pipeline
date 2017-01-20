node {

  // Mark the code checkout 'stage'....
  stage 'Checkout'
  // Get some code from a GitHub repository
 
  git url: 'https://github.com/juanjmerono/pipeline.git'

  def mvnHome = tool 'Maven-3.3.9'
  // Mark the code build 'stage'....
  stage 'Build'
	  sh "${mvnHome}/bin/mvn clean install"
 
}