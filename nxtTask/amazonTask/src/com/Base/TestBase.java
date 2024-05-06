package com.Base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;

   public String URL = "https://qa-test-frontend-ce07bae316f3.herokuapp.com/";
  
	public TestBase()  {
	
			 
                //set the path of chrome driver
				System.setProperty("webdriver.chrome.driver",
						System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

				// Initialize browser
				driver = new ChromeDriver();

				// Open the URL
				driver.get(URL);
				driver.manage().window().maximize();
			
			}
	public static void CloseBrowser() {
		
		try {
			driver.quit();
		
		} catch (Exception ex) {
	
		}

	}

}
