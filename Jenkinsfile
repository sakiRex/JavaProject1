pipeline {

    agent any // where to execute
	
    environment {
	NEW_VERSION = '1.3.0'
    }

    stages { // where the work happens
   
        stage("build") {
	  
	        steps {
		        echo "building the application..."
			echo "version ${NEW_VERSION}"
		    }
        }

        stage("test") {
	  
	        steps {
		        echo "testing the application..."		 
		    }
        }

        stage("deploy") {
	  
	        steps {
		        echo "deploying the application..."
			withCredentials([
			    usernamePassword(credentials: 'demo-app-git-credentials', usernameVariable: USER, passwordVariable: PWD)
			]) {
				echo "here we can run some script that makes use of username: ${USER} and password: ${PWD}"
			}
		    }
        }
    }
}
