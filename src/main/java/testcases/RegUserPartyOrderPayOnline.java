package testcases;

import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RegUserPartyOrderPayOnline extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String quantity,String date,String time,String cname,String cnum,String exdate,String cvv,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickMenuAndOrder()
	.clickPartyMenu()
	.clickRiceAndNoodle()
	.clickMangolian()
	.enterQuantity(num)
	.clickIngredient()
	.clickAddToOrder()
	.clickCheckOut()
	.enterLettuce(quantity)
	.clickLettuceAddToOrder()
    .clickCheckOut()
    .clickCalendar(date)
    //.clickNext()
    //.clickDate()
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
dataSheetName="PW008";
browserName="chrome";
testCaseName="RegUserPartyOrderPayOnline";
testDescription="User Logging in using POM";
}

}
