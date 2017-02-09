package testcases;

import pages.HomePage;
//import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegUserRegularAndPartyOrderPayOnline extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String num1,String quantity,String date,String time,String cname,String cnum,String exdate,String cvv,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

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
 // .clickDate()
  .selectTime(time)
  .clickPayOnline()
  .clickPlaceOrder2()
  .enterName(cname)
  .enterCardNumber(cnum)
  .enterExpDate(exdate)
  .enterCvv(cvv)
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
;	}
@BeforeClass
public void beforeClass() {
dataSheetName="PW009";
browserName="chrome";
testCaseName="RegUserRegularAndPartyOrderPayOnline";
testDescription="User Logging in using POM";
}
}
