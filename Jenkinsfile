pipeline {
    agent any
    stages {
        stage('Info') {
            steps {
                echo env.BRANCH_NAME
            }
        }
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
            }
        }
    }
}
