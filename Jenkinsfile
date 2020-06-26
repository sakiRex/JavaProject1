pipeline {

    agent any // where to execute

    stages { // where the work happens
   
        stage("build") {
	  
	        steps {
		        echo "building the application..."
			echo "change made June 26, 2020 at 1029"
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
		    }
        }
    }
}
