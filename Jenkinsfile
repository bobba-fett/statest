pipeline {
    agent any
    stages {
        stage('Build') {
            sh './gradlew --console=plain clean build'
        }
    }
}
