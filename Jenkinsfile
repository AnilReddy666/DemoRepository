pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Use bat instead of sh on Windows
                bat 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy step goes here'
            }
        }
    }
}
