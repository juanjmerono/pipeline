node {

  // Mark the code checkout 'stage'....
  stage 'Checkout'
  // Get some code from a GitHub repository
 
  git url: 'https://github.com/juanjmerono/pipeline.git'
  // Clean any locally modified files and ensure we are actually on origin/master
  // as a failed release could leave the local workspace ahead of origin/master
  sh "git clean -f && git reset --hard origin/master"

  def mvnHome = tool 'Maven-3.3.9'
  // Mark the code build 'stage'....
  stage 'Build'
	  sh "${mvnHome}/bin/mvn clean install"
 
}