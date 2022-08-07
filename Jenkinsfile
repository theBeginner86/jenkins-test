pipeline {
    agent any
    
    tools {
        gradle 'Gradle-7.5.1'
    }
    
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
                sh './gradlew -v'

            }
        }
    }
}
