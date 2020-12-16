pipeline {
    agent any
    stages {
        stage('Info') {
            steps {
                echo "Job '${JOB_NAME}' (${BUILD_NUMBER}) is waiting for input\nPlease go to ${BUILD_URL} and verify the build"
            }
        }
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
            }
        }
    }
}
