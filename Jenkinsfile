pipeline
{
	agent any
	stages
	{
		stage('Test')
		{
			steps
			{
				bat "mvn clean compile"
			}
		}
		stage('Sonar Code Analysis')
		{
			steps
			{
				withSonarQubeEnv(credentialsId: 'sonar', installationName: 'sonarqube')
				{
                    bat "mvn test sonar:sonar"
				}
			}
		}
	}
}