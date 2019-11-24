pipeline
{
	agent any
	stages
	{
		stage('Test')
		{
			steps
			{
				bat "mvn test"
			}
		}
		stage('Sonar Code Analysis')
		{
			steps
			{
				withSonarQubeEnv(credentialsId: 'sonar')
				{
					withMaven(maven:'Maven 3.5')
					{
                        bat 'mvn test sonar:sonar'
					}
				}
			}
		}
	}
}