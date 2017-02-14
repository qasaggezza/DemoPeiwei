package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//This testcase is to check whether a Guest user is able to place a regular order within $250
//using pay Online option. Also check for the confirmation mail from the Restaurant.

public class GuestUserRegularOrderPayOnline extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String loc,String num,String rice, String quantity,String date,String time,String fname, String lname, String Email,String Phone, String Zip,String cname, String cnum,String Exdate, String cvv,String month, String Emailaddr, String Password,String txt) throws InterruptedException {

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
	.clickServedWith1()
	.clickAddToOrder()
	.clickCheckOut()
	.selectRice(rice)
	.enterQuan(quantity)
	.clickRiceAddToOrder()
    .clickCheckOut()
    .clickCalendar(date)
   // .clickNext()
    //.clickDate()
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
   /* //.enterAddress(addr)
    //.enterCity(city)
    //.selectState(state)
    //.enterZipCode(Zip1)
*/    .clickPayWithCard()
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
dataSheetName="GuestUserRegularOrderPayOnline";
browserName="chrome";
testCaseName="GuestUserRegularOrderPayOnline";
testDescription="Check whether a Guest user is able to place a regular order and Pay Online";
}

}
