package testcases;
import pages.HomePage;
//import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ValidateAddFavorite extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String date,String time,String Emailaddr, String Password,String verifytext) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickOrderFavourite()
	.clickCheckOutFavourite()
	.clickQuinoaAddToFavorite()
	.clickCheckOut()
	.clickCalendar(date)
	.selectTime(time)
	.clickPlaceOrder()
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
	dataSheetName="PW020";
	browserName="chrome";
	testCaseName="ValidateAddFavorite";
	testDescription="ValidateAddFavorite using POM";
	}
}
