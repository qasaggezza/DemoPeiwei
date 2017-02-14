package testcases;
import pages.HomePage;
//import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//This testcase is to check whether a Registered user is able to place an order under Favourite's section
// using pay at Restaurant option. Also check for the confirmation mail from the Restaurant.

public class ValidateAddMyFavorite extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String date,String time,String dat,String Emailaddr, String Password,String verifytext) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickOrderFavourite()
	.clickCheckOutFavourite()
	//.clickQuinoaAddToFavorite()
	.clickCheckOut()
	.clickCalendar(date)
	.selectTime(time)
	.clickPlaceOrder()
	.verifydate(dat)
	//.verifyMonth(mon)
	.verifytime(time)
	.InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()  
    .verifyText1(verifytext)
	;	
	}
	
	@BeforeClass
	public void beforeClass() {
	dataSheetName="ValidateAddMyFavorite";
	browserName="chrome";
	testCaseName="ValidateAddMyFavorite";
	testDescription="Check whether the Registered User is able to place an order under Favourite's section";
	}
}
