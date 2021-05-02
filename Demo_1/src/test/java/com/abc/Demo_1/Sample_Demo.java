package com.abc.Demo_1;

/*
 * 
 * demo maven projectfsffsfsfs
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 *  Building jar: C:\Workspace_MAVEN\sample_maven\target\sample_maven-0.0.1-SNAPSHOT.jar   -- this is the jar file we get in target folder
 *  after we perform maven install --- by using this jar we can test the app
 *  
 *  
 * 
 */
public class Sample_Demo {
	
	
	
	/*-> here we can write normal testng file from java class after that inorder to create that java file to test suite just rt-click on java file -> testng - >select convet to testng ==>it creates testng suite.xml file


			==> in pom.xml ==> here we need to create build tag and go to maven repository site : https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html 
			 and copy paste Using Suite XML Files code inorder to run suit testng file from pom.xml file of maven project
			 just clean the project once and go to command prompt :to go location of the project till pom.xml then give mvn clean test : it will run from commnad
			 prompt it self or u can directly rt-click on project build maven test select  -->*/
	
	@Test
	public void launch_browser()
	{  
		
		System.setProperty("webdriver.chrome.driver", "C://TESTING TOOLS - SOFTWARES/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.javatpoint.com/");
		// remove all cookies
		//driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		
	}

}
