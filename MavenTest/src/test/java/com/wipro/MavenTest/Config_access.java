package com.wipro.MavenTest;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Config_access {

	 static  WebDriver driver; 
	 static Properties p=new Properties();
	
	@BeforeSuite
	 static void initializeBrowser() throws Exception {
	
	File f=new File( System.getProperty("user.dir")+"//Resources//config//config.properties");
	
	FileInputStream fis=new FileInputStream(f);
	
	p.load(fis);
	}
	
	@AfterSuite
	 static void closeBrowser() {
		// Close browser
		driver.close();
	}

	
	@Test(priority=0 )
	 void launchbrowser()

	{			
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
	//	System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\resources\\drivers\\chromedriver.exe");
		
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.learn-automation.com");
	}
	
	@Test(priority=5)
	 void navigategoogle()

	{	
		System.out.print(p.getProperty("url"));
			driver.navigate().to(p.getProperty("url"));
	}
}
