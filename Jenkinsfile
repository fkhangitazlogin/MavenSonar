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
		stage('Test')
		{
			steps
			{
				bat "mvn test"
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
			    	echo 'sonar code scan completed'
			    }
            }
        }
	}
}