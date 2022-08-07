pipeline {
    agent any
    parameters {
        choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: '')
        booleanParam(name: 'executeTests', defaultValue: true, description: '')
    }
    stages {
        stage("Build") {
            steps {
                echo "building... ${params.VERSION}"
            }
        }
        stage("Test"){
            when {
                expression {
                    params.executeTests == true
                }
            }
            steps {
                echo "testing... ${params.VERSION}"
            }
        }
        stage("Deployment"){
            steps {
                echo "deploying... ${params.VERSION}"
            }
        }
    }
}
