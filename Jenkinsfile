properties([[$class: 'BuildDiscarderProperty',
			strategy: [$class: 'LogRotator', numToKeepStr: '10']],
			pipelineTriggers([cron('@midnight')]),
			])
node {
	// Mark the code checkout 'stage'....
	stage ('Checkout') {
		// Checkout code from repository
		checkout scm
	}

	if (env.BRANCH_NAME != 'master') {
		sh "git status"
	}

	// Mark the code build 'stage'....
	stage ('Build') {
		withMaven(maven: 'Maven-3.3.9') {
      		// Run the maven build
      		sh "mvn clean install"
		} // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe reports and FindBugs reports	   // Run the maven build
	}
}
