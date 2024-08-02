pipeline {
    agent any

    tools {
        // Install the JDK tool configured in Jenkins global tools configuration
        java 'OpenJDK 11'
    }

    environment {
        // Define environment variables if needed
        HOME = '.'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout from a version control system
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Run the Gradle build script
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                // Run tests using Gradle
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                // Add steps to deploy your microservice
                script {
                    // Hypothetical Docker build and push, adjust as necessary for your workflow
                    sh 'docker build -t my-calculator-service:${BUILD_NUMBER} .'
                    sh 'docker push my-calculator-service:${BUILD_NUMBER}'

                    // Update service deployment, for example in Kubernetes
                    sh 'kubectl set image deployment/my-calculator-service my-calculator-service=my-calculator-service:${BUILD_NUMBER} --record'
                }
            }
        }
    }
    post {
        always {
            // Clean up after the pipeline run
            cleanWs()
        }
        success {
            // Actions to take on successful pipeline completion
            echo 'The pipeline completed successfully!'
        }
        failure {
            // Actions to take if the pipeline fails
            echo 'The pipeline failed!'
        }
    }
}
