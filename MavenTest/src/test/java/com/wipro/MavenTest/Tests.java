package com.wipro.MavenTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {

	@Test(priority = 3, description = "Assert")
	public void t3() {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.learn-automation.com");
		driver.navigate().to("https://google.com");
	}
}
