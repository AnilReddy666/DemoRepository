pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Compile and package the project
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                // Run TestNG + Cucumber tests
                sh 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy step goes here'
                // Example: sh 'scp target/myapp.jar user@server:/deploy'
            }
        }
    }
}
