package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class RegUserMyPeiWeiRewards extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickMyWeiRewards()
	.verifyCard()
	.clickEarnAVisit()
	.clickMyWeiRewards1()
	.clickFAQ()
	.clickMyWeiRewards1()
	  ;
		}
	@BeforeClass
	public void beforeClass() {
	dataSheetName="PW018";
	browserName="chrome";
	testCaseName="RegUserMyPeiWeiRewards";
	testDescription="User Logging in using POM";
	}

}
