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
			    	bat 'mvn sonar:sonar'
			    }
            }
        }
        /*stage('build coverage check')
        {
            steps
            {
                bat 'mvn clean verify'
            }
        }*/
	}
}