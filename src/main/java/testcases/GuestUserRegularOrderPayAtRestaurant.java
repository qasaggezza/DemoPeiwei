package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class GuestUserRegularOrderPayAtRestaurant extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String loc,String num,String quantity,String date,String time,String fname, String lname, String Email,String Phone, String Zip,String month, String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.enterChangeLoc(loc)
	.clickSearch()
	.clickP2labs()
	.clickMenuAndOrd()
	.clickRiceAndNoodle()
	.clickMangolian()
	.enterQuantity(num)
	.clickSize1()
	.clickIngredient()
	.clickServedWith1()
	.clickAddToOrder()
	.clickCheckOut()
	.enterWhite(quantity)
	.clickWRiceAddToOrder()
    .clickCheckOut()
    .clickCalendar(date)
    //.clickNext()
    //.clickDate()
    .selectTime(time)
    .enterFname(fname)
    .enterLname(lname)
    .enterEmail(Email)
    .enterPhone(Phone)
    .enterZipCode(Zip)
    .clickPlaceOrder()
    .verifyMonth(month)
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
dataSheetName="PW010";
browserName="chrome";
testCaseName="GuestUserRegularOrderPayAtRestaurant";
testDescription="User Logging in using POM";
}

}
