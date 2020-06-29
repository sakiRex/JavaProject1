pipeline {

    agent any // where to execute
	
    environment {
	NEW_VERSION = '1.3.0'
    }
	
    parameters {
         choice(name: 'VERSION', choices: ['1.1.0', '1.2.0', '1.3.0'], description: 'blah1')
	 booleanParam(name: 'executeTests', defaultValue: true, description: 'blah2')
    }

    stages { // where the work happens
        stage("init") {
	  
	        steps {
			script {
				gv = load "script.groovy"
			}
		}
        }   
        stage("build") {
	  
	        steps {
		        echo "building the application..."
			echo "version ${NEW_VERSION}"
			script (
  			        gv.buildApp()
			}
		}
        }

        stage("test") {
		//when {
		//	expression {
		//		${params.executeTests}
		//	}
		//}
	        steps {
		        echo "testing the application..."
			script {
			        gv.testApp()
			}
		}
        }

        stage("deploy") {
	  
	        steps {
		        echo "deploying the application..."
			echo "deploying version ${params.VERSION}"
			//withCredentials([
			//    usernamePassword(credentials: 'demo-app-git-credentials', usernameVariable: USER, passwordVariable: PWD)
			//]) {
		        //    echo "here we can run some script that makes use of username: ${USER} and password: ${PWD}"
			//}
			script {
			        gv.deployApp()
			}
		}
        }
    }
}
