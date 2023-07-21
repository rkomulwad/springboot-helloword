pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                script {
                    //sh 'mvn -B -DskipTests clean package' 
                      echo 'building '
                      echo env.BRANCH_NAME
                      echo env.GIT_BRANCH
                }
            }
        }
    }
}

