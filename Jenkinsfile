pipeline {
    agent any
    stages {
        stage('Clean') {
            steps {
                bat 'mvn clean'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Install Jar') {
            steps {
                bat 'mvn install -DskipTests'
            }
        }
    }
}
