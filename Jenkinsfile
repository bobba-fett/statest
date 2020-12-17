pipeline {
    agent any
    tools {
        jdk 'openjdk-11'
    }
    stages {
        stage('Build') {
            steps {
                sh './gradlew --console=plain clean build'
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
                junit '**/build/test-results/test/*.xml'
            }
        }
    }
}
