def gv

pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }
        stage("Build") {
            steps {
                scripts {
                    gv.buildFunc()
                }
            }
        }
        stage("Test"){
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                script {
                    gv.testFunc()
                }
            }
        }
        stage("Deployment"){
            steps {
                script {
                    gv.deployFunc()
                }
            }
        }
    }
}
