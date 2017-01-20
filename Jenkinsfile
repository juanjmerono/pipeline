node {

  def mvnHome = tool 'Maven-3.3.9'
  // Mark the code build 'stage'....
  stage 'Build'
	  sh "${mvnHome}/bin/mvn clean install"
 
}