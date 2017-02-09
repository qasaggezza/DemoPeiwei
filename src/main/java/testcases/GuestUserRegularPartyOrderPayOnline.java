package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class GuestUserRegularPartyOrderPayOnline extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String loc,String num,String num1,String quantity,String date,String time,String fname, String lname, String Email,String Phone, String Zip,String cname, String cnum,String Exdate, String cvv,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.enterChangeLoc(loc)
	.clickSearch()
	.clickP2labs()
	.clickMenuAndOrd()
	.clickRiceAndNoodle()
	.clickSesame()
	.enterQuantity(num)
	.clickSize1()
	.clickIngredient()
	.clickServedWith2()
	.clickAddToOrder()
	.clickKeepLooking()
	.clickPartyMenu()
	.clickRiceAndNoodle()
	.clickMangolian()
	.enterQuantity(num1)
	.clickIngredient()
	.clickAddToOrder()
	.clickCheckOut()
	.enterLettuce(quantity)
	.clickLettuceAddToOrder()
    .clickCheckOut()
    .clickCalendar(date)
   // .clickNext()
   // .clickDate()
    .selectTime(time)
    .clickPayOnline()
    .enterFname(fname)
    .enterLname(lname)
    .enterEmail(Email)
    .enterPhone(Phone)
    .enterZipCode(Zip)
    .clickPlaceOrder2()
    .enterName(cname)
    .enterCardNumber(cnum)
    .enterExpDate(Exdate)
    .enterCvv(cvv)
   /* .enterAddress(addr)
    .enterCity(city)
    .selectState(state)
    .enterZipCode(Zip1)*/
    .clickPayWithCard()
    .verifydate(month)
    .verifytime(time)
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)
     ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="PW015";
browserName="chrome";
testCaseName="GuestUserRegularPartyOrderPayOnline";
testDescription="User Logging in using POM";
}

}
