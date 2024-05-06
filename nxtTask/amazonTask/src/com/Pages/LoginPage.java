package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

	static WebDriver driver;
   WebDriverWait wait;

	// Locators of Elements of the login page
	By usernameTxt = By.id("username");
	By passwordTxt = By.id("password");
	By loginBtn = By.xpath("//form/div/div[2]/button");
	By skipBtn = By.xpath("//form/div/div[3]/button[@type='button']");

	
	// Constructor
	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds( 1000 ));

	}

	// Set Username Text field
	public void setUsernamevalue(String usrname) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(usernameTxt));
		driver.findElement(usernameTxt).sendKeys(usrname);
	}

	// Set Password Text field
	public void setPassowrdvalue(String Password) throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(passwordTxt));
		driver.findElement(passwordTxt).sendKeys(Password);
	}

	// click on login button

	public void clickLogin() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(loginBtn));
		driver.findElement(loginBtn).click();
	}

	// click on Skip button

	public void clickSkip() throws InterruptedException {
		wait.until(ExpectedConditions.visibilityOfElementLocated(skipBtn));
		driver.findElement(skipBtn).click();
	}

	
	

}
