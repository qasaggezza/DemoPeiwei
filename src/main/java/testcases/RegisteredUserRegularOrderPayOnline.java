package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//This testcase is to check whether a Registered user is able to place a regular order within $250
//using pay Online option. Also check for the confirmation mail from the Restaurant.

public class RegisteredUserRegularOrderPayOnline extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String rice,String qua,String date,String time,String cname,String cnum,String exdate,String cvv,String dat,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.verifyMailId(emailadd)              //Verify EmailId
	.clickMenuAndOrder()
	.clickRiceAndNoodle()
	.clickJapeneseSteak()
	.enterQuantity(num)
	//.clickSize1()
	//.clickIngredient()
	//.clickServedWith1()
	.clickAddToOrder()
	.clickCheckOut()
	.selectRice(rice)
	.enterQuan(qua)
    .clickRiceAddToOrder()
    .verifyMenuQuantity(num)     //Verify Menu Quantity
    .verifyExtrasQuantity(qua)   //Verify Extras Quantity
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
    .verifydate(dat)            //Verify Month
    .verifytime(time)           //Verify Time
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)          // verify Confirmation Mail
     ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="RegisteredUserRegularOrderPayOnline";
browserName="chrome";
testCaseName="RegisteredUserRegularOrderPayOnline";
testDescription="Check whether a Registered user is able to place a regular order and Pay Online";
}

}
