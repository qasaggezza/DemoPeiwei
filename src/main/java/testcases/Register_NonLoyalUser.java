package testcases;


import org.testng.annotations.Test;


import pages.HomePage;
import pages.Register;
import pages.AccountOverview;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class Register_NonLoyalUser extends PeiweiWrappers{
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
		dataSheetName="PW002";
		browserName="chrome";
		testCaseName="Register Non-Loyal User";
		testDescription="User Registration using POM";
	}

}
