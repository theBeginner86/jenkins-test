pipeline {
    agent any
    
    tools {
        gradle 'Gradle-7.5.1'
    }
    
    stages {
        stage("Build") {
            steps {
                echo 'building...'
            }
        }
        stage("Test"){
            steps {
                echo 'testing...'
            }
        }
        stage("Deployment"){
            steps {
                echo 'deploying...'
            }
        }
    }
}
