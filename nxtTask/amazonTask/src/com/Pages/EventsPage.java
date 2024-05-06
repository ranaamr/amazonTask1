package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EventsPage {
	
	static WebDriver driver;
	WebDriverWait wait;
	//Locators of the dashboard page
	By myEventsTxt = By.xpath("//section/div[1]/div/h2");
	By eventLink = By.xpath("//td[@id='col-1']/div[text()='Rana Event Test']");

	
	// Constructor
	public EventsPage(WebDriver driver) {
		EventsPage.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds( 1000 ));
		// TODO Auto-generated constructor stub
	}

	//get page title
	public String getPageTitle() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(myEventsTxt));
		return driver.getTitle();
	}

 // Navigate to the eventPage

	public void navigateToEventLink() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(eventLink));
		driver.findElement(eventLink).click();
	}
			
	

}
