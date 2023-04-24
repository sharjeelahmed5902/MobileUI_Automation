Prerequisite:
		1. Maven should be present in system and environment variable should be created
		2. Appium server should be running successfully with appropriate application opened
	
Software and tools used:
		1.  Eclipse IDE
		2.  Selenium 4.8.3 jar dependency
		3.  testng 6.8.8 jar dependency
		4.  appium java client 8.2.0 jar dependency
	
Console Output
		The console output is more intuitive and better readable as the default one of maven,testng and Selenium. 
		A  console output will give you a clear overview about which tests are currently running. 
	
TestNG report:

		.\test-output\emailable-report.html
		.\test-output\index.html
		
Command to execute:

Windows:
		Open command prompt
		Navigate to project directory(command: cd ..(directory))
		command to call :  call mvn clean install
MacOS:
		Open terminal 
		Navigate to project directory
		command to call : mvn clean install