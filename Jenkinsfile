pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew build'
            }
        }
        stage('Test') {
            steps {
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                // Add steps to deploy your microservice
                // For example, you might push a Docker image to a registry
                // and then update a service in your deployment environment
            }
        }
    }
}
