pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
            }
        }
    }
}
