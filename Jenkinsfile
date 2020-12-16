pipeline {
    agent {
      docker {
        image 'gradle:6.7.1'
      }
    }
    stages {
        stage('Build') {
            steps {
                sh 'gradle --console=plain clean build'
            }
        }
    }
}
