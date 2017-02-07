package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class RegUserRegularOrderPayOnline extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String quantity,String date,String time,String cname,String cnum,String exdate,String cvv,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickMenuAndOrder()
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
dataSheetName="PW007";
browserName="chrome";
testCaseName="RegUserRegularOrderPayOnline";
testDescription="User Logging in using POM";
}

}
