
pipeline {
	agent any
	stages {
		stage('Build') {
			steps {
				sh 'echo "Building.."'
				./gradlew build -x test
			}
		}
		stage('Test') {
			steps {
				sh 'echo "Testing.."'
				./gradlew test
			}
		}
	}
}
