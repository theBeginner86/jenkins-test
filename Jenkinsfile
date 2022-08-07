pipeline {
    agent any
    stages {
        stage("run frontend") {
            steps {
                echo 'executing yarn...'
                nodejs('Node-18.7'){
                    sh 'yarn install'
                    sh 'node -v'
                    sh 'yarn -v'
                }
            }
        }
        stage("run backend"){
            steps {
                echo 'executing gradle...'
                withGradle(){
                    sh './gradlew -v'
                }
            }
        }
    }
}
