package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;
import wrappers.GenericWrappers;
import org.testng.annotations.BeforeClass;

//This testcase is to check whether a Registered user is able to place a Regular order with in $250
//using pay at restaurant option. Also check for the confirmation mail from the Restaurant.

public class RegisteredUserRegularOrderPayAtRestaurant extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String rice, String qua,String date,String time,String month,String Emailaddr,String Password,String txt) throws InterruptedException {

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
   // .verifyExtras(rice)
    .clickCheckOut()
    .clickCalendar(date)
    //.clickNext()
    //.clickDate()
    .selectTime(time)
    .clickPlaceOrder()
    .verifydate(month)  //Verify Month
    .verifytime(time)   //Verify Time
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)  // verify Confirmation Mail
    ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="RegisteredUserRegularOrderPayAtRestaurant";
browserName="chrome";
testCaseName="RegisteredUserRegularOrderPayAtRestaurant";
testDescription="Check whether a registered user is able to place a regular order and Pay at Restaurant";
}

}
