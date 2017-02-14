package testcases;


import org.testng.annotations.Test;


import pages.HomePage;
import pages.Register;
import pages.AccountOverview;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//This testcase is to check whether a user is able to register successfully as a Non-Loyal user.
//Also check for the welcome mail from the Restaurant.

public class RegisterNonLoyalUser extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
	public void login(String emailaddress,String passWord,String fname,String lname,String phone,String zipcode,String Emailaddr, String Password, String msg) throws InterruptedException {

		new HomePage()
	    .clickRegister()
	    .enterEmailaddress(emailaddress)
		.enterPassword(passWord)
		.enterFirstname(fname)
		.enterLastname(lname)
		.enterPhone(phone)
		.enterZip(zipcode)
		.clickenableLoyal()
		.clickCreateMyAccount2()
		.clickLogout()
		.clickNotUserName()
		.InvokeGmail2()
	    .enterEmailaddress(Emailaddr)
	    .enterNext()
	    .enterPassword(Password)
	    .clickSignIn()
	    .clickUnreadMail()
	    .verifyText2(msg)
		;
	}
	@BeforeClass
	public void beforeClass() {
		dataSheetName="RegisterNonLoyalUser";
		browserName="chrome";
		testCaseName="RegisterNonLoyalUser";
		testDescription="Check whether a user is able to successfully register as a loyal customer";
	}

}
