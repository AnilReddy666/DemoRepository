pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                script {
                    def mvnHome = tool 'MAVEN_HOME'
                    bat "\"${mvnHome}\\bin\\mvn.cmd\" clean install"
                }
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