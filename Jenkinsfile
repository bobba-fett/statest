pipeline {
    agent {
      docker {
        image 'gradle:6.7.1-jdk11'
      }
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle --console=plain clean build'
                archiveArtifacts artifacts: '**/build/libs/*.jar', fingerprint: true
                junit '**/build/test-results/test/*.xml'
            }
        }
    }
}
