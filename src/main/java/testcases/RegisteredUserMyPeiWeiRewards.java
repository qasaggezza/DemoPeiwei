package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

// This testcase is to check whether a user is able to validate MyPeiweiRewards page.

public class RegisteredUserMyPeiWeiRewards extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.verifyMailId(emailadd)              //Verify EmailId
	.clickMyWeiRewards()
	.verifyCard()                        //Verify Card
	.clickEarnAVisit()
	.clickMyWeiRewards1()
	.clickFAQ()
	.clickMyWeiRewards1()
	  ;
		}
	@BeforeClass
	public void beforeClass() {
	dataSheetName="RegisteredUserMyPeiWeiRewards";
	browserName="chrome";
	testCaseName="RegisteredUserMyPeiWeiRewards";
	testDescription="Check whether the Registered User is able to validate MyPeiweiRewards page";
	}

}
