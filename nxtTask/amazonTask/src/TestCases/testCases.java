package TestCases;

import com.Base.TestBase;
import com.Pages.EventsPage;
import com.Pages.LoginPage;
import com.Pages.UsersPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class testCases extends TestBase {

	LoginPage loginobj;
	EventsPage eventsobj;
	UsersPage usersobj;


	@BeforeTest
	public void beforeMethod() throws InterruptedException {

		loginobj = new LoginPage( driver );
		eventsobj = new EventsPage( driver );
		usersobj = new UsersPage( driver );

	}

	// Positive login scenario
	@Test(priority = 1)
	public void verifyEventsListOpenedSuccessfully() throws InterruptedException {
		//	driver.manage().timeouts().implicitlyWait( Duration.ofSeconds(10));
		loginobj.setUsernamevalue( "nxttester" );
		loginobj.setPassowrdvalue( "nxt#qA@23" );
		loginobj.clickLogin( );
		loginobj.clickSkip( );
		String actualTitle = eventsobj.getPageTitle( );
		Assert.assertEquals( actualTitle, "Events | AWS" );

	}

	@Test(priority = 2)
	public void verifyUserAddedSuccessfully() throws InterruptedException {
		eventsobj.navigateToEventLink( );
		usersobj.navigateToAttendeesScreen( );
		usersobj.goToUsersList();
		usersobj.clickAddUserBtn();
		usersobj.editFirstNamevalue( "RanaFirst");
		usersobj.editLastNamevalue( "AmrLast" );
		usersobj.editTitlevalue( "TitleTest" );
		usersobj.editOrgvalue( "Org Test" );
		usersobj.editContactNovalue( "245677639" );
		usersobj.editEmailvalue( "emailtest2@outlook.com" );
		usersobj.editUsernamevalue( "testUser2" );
		usersobj.clickCreate();
		usersobj.verifySuccessMsgDisplayed();
		String actualtextMsg = usersobj.getSuccessMsgText();
		assertTrue(actualtextMsg.contains("created successfully"));

	}

	@Test(priority = 3)
	public void verifyTripAddedSuccessfullyTpUser() throws InterruptedException {
	    usersobj.navigateToTripInfoTab();
		usersobj.clickAddTripBtn();
		usersobj.choosePackagevalue(1);
		usersobj.clickCreate();
		usersobj.verifySuccessMsgDisplayed();
		String actualtextMsg = usersobj.getSuccessMsgText();
		assertTrue(actualtextMsg.contains("created successfully"));
		usersobj.verifyTripCreatedSuccessfully();

	}


//	@AfterTest
//	public void afterMethod() {
//		CloseBrowser();
//	}
//
//}
}