pipeline
{
	agent any
	stages
	{
		stage('Build')
		{
			steps
			{
				bat "mvn clean compile"
			}
		}
		stage('JaCoCo')
		{
            steps 
			{
                echo 'Code Coverage'
                jacoco()
            }
        }
        stage('Sonar') 
		{
            steps 
			{
                echo 'Sonar Scanner'
			    withSonarQubeEnv('sonarqube') 
				{
			    	bat 'mvn sonar:sonar'
			    }
            }
        }
        stage('Test Coverage Threshold')
        		{
        			steps
        			{
        				bat "mvn clean test"
        			}
        		}
	}
}