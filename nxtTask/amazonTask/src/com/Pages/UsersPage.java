package com.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsersPage {
	static WebDriver driver;
	WebDriverWait wait;
	By registrationPath = By.xpath( "//main/div[4]/div[1]" );
	By attendeesPath = By.xpath( "//main/div[4]/div/div/ul/li/a[@href='/users']" );
	By allusersList = By.xpath( "//div[@class='flex space-x-s10 mb-s30']" );
	By addUserBtn = By.xpath( "//a[@href='/users/new']" );
	By firstName = By.id( "firstName" );
	By lastName = By.id( "lastName" );
	By titleTxt = By.id( "title" );
	By orgTxt = By.id( "organization" );
	By emailTxt = By.id( "email" );
	By usernameTxt = By.id( "username" );
	By contactNo = By.xpath( "//div/input[@placeholder='Phone Number']" );
	By createBtn = By.xpath( "//div[@class='w-20 sm:w-32']/button" );
	By TripinfoTab = By.xpath( "(//div[@class='flex items-center space-x-s5']/p)[2]" );
	By addTripBtn = By.xpath( "//a/div/p[contains(text(),'Add Trip')]" );
	//By addTripBtn = By.xpath( "//a/div/p[contains(text(),'Add Trip')]" );
	By successMsg = By.xpath( "//div[@role='status']" );
	By packagesList = By.id("entity");
	By tripHeader = By.xpath( "(//h3[contains(text(),'Trip 0')])[1]" );


	// Constructor
	public UsersPage(WebDriver driver) {
		UsersPage.driver = driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds( 1000 ));
		// TODO Auto-generated constructor stub
	}

	// Navigate to attendees list
	public void navigateToAttendeesScreen() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( registrationPath ) );
		driver.findElement( registrationPath ).click( );
		wait.until( ExpectedConditions.visibilityOfElementLocated( attendeesPath ) );
		driver.findElement( attendeesPath ).click( );
	}

	// Go to All user list
	public void goToUsersList() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( allusersList ) );
		driver.findElement( allusersList ).click( );


	}

	// Click on add user btn
	public void clickAddUserBtn() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( addUserBtn ) );
		driver.findElement( addUserBtn ).click( );


	}

	// Edit first name Text field
	public void editFirstNamevalue(String FirstName) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( firstName ) );
		driver.findElement( firstName ).clear( );
		driver.findElement( firstName ).sendKeys( FirstName );
	}

	// Edit last name Text field
	public void editLastNamevalue(String LastName) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( lastName ) );
		driver.findElement( lastName ).clear( );
		driver.findElement( lastName ).sendKeys( LastName );
	}

	// Edit Title Text field
	public void editTitlevalue(String Title) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( titleTxt ) );
		driver.findElement( titleTxt ).clear( );
		driver.findElement( titleTxt ).sendKeys( Title );
	}

	// Edit Org Text field
	public void editOrgvalue(String Org) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( orgTxt ) );
		driver.findElement( orgTxt ).clear( );
		driver.findElement( orgTxt ).sendKeys( Org );
	}

	// Edit contact number Text field
	public void editContactNovalue(String Number) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( contactNo ) );
		driver.findElement( contactNo ).clear( );
		driver.findElement( contactNo ).sendKeys( Number );
	}

	// Edit Email Text field
	public void editEmailvalue(String Email) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( emailTxt ) );
		driver.findElement( emailTxt ).clear( );
		driver.findElement( emailTxt ).sendKeys( Email );
	}

	// Edit username Text field
	public void editUsernamevalue(String Username) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( usernameTxt ) );
		driver.findElement( usernameTxt ).clear( );
		driver.findElement( usernameTxt ).sendKeys( Username );
	}


	// click on Create button
	public void clickCreate() throws InterruptedException {
	WebElement	element = driver.findElement(createBtn);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

	}

	// verify success message
	public Boolean verifySuccessMsgDisplayed() throws InterruptedException {

		 wait.until(ExpectedConditions.visibilityOfElementLocated(successMsg));
		boolean isdisplayed = driver.findElement( successMsg ).isDisplayed( );
		return isdisplayed;

	}
	public String getSuccessMsgText () throws InterruptedException{
		String actual = driver.findElement( successMsg ).getText();
		return actual;
	}
	//Go to Trip Info tab
	public void navigateToTripInfoTab() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( TripinfoTab ) );

		WebElement	element = driver.findElement(TripinfoTab);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	//Click on add trip btn
	public void clickAddTripBtn() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( addTripBtn ) );
		driver.findElement( addTripBtn ).click( );
	}

	// Select from packages drop down menu
	public void choosePackagevalue(int index) throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( packagesList ) );
		WebElement selectElement = driver.findElement( By.cssSelector( "#entity" ) );
		Select select = new Select( selectElement );
		select.selectByIndex( index );

	}

	// verify Trip created successfully
	public String verifyTripCreatedSuccessfully() throws InterruptedException {
		wait.until( ExpectedConditions.visibilityOfElementLocated( tripHeader ) );

		String actualText = driver.findElement( tripHeader ).getText( );
		return actualText;

	}

}