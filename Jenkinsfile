
pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'echo "Building.."'
				sh './gradlew build -x test'
			}
		}
		stage('Test') {
			steps {
				sh 'echo "Testing.."'
				sh './gradlew test'
			}
		}
	}
}
