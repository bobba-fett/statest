pipeline {
    agent any
    stages {
        stage('Info') {
            steps {
                echo "Branch name: ${BRANCH_NAME}"
            }
        }
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
            }
        }
    }
}
