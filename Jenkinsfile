pipeline {
    agent any

    stages {
        stage('Build and Unit Test') {
            steps {
                sh 'fastlane tests'
            }
        }
        
        stage('Deliver for Development') {
            when {
                branch 'development'
            }
            steps {
                echo "Go to development"
            }
        }
        stage('Deploy for production') {
            when {
                branch 'production'
            }
            steps {
                echo "Go to Prodcution"
            }
        }
    }
}