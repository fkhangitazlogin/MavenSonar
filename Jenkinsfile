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
		stage('Test Coverage Threshold')
        {
            steps
            {
                bat "mvn clean test"
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
	}
}