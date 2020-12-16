pipeline {
    agent any
    stages {
        stage('Info') {
            steps {
                echo "Branch name: $env"
            }
        }
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
            }
        }
    }
}
