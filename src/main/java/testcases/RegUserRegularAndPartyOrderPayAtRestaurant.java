package testcases;
import pages.HomePage;
//import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegUserRegularAndPartyOrderPayAtRestaurant extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String num1,String quantity,String date,String time,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickMenuAndOrder()
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
    //.clickDate()
    .selectTime(time)
    .clickPlaceOrder()
    .verifydate(month)
    .verifytime(time)
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)
  ;	}
@BeforeClass
public void beforeClass() {
dataSheetName="PW006";
browserName="chrome";
testCaseName="RegUserRegularAndPartyOrderPayAtRestaurant";
testDescription="User Logging in using POM";
}

}
