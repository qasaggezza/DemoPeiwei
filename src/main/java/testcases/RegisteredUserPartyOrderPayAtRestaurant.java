package testcases;

import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//This testcase is to check whether a Registered user is able to place a Party order with in $500
//using pay at restaurant option. Also check for the confirmation mail from the Restaurant.

public class RegisteredUserPartyOrderPayAtRestaurant extends PeiweiWrappers{
	@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String quantity,String date,String time,String month,String Emailaddr, String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.verifyMailId(emailadd)              //Verify EmailId
	.clickMenuAndOrder()
	.clickPartyMenu()
	.clickRiceAndNoodle()
	.clickPartyMangolian()
	.enterQuantity(num)
	.clickIngredient()
	.clickAddToOrder()
	.clickCheckOut()
	.enterLettuce(quantity)
	.clickLettuceAddToOrder()
	.verifyMenuQuantity(num)           //Verify Menu Quantity
	.verifyExtrasQuantity(quantity)    //Verify Extras Quantity
    .clickCheckOut()
    .clickCalendar(date)
   // .clickNext()
   // .clickDate()
    .selectTime(time)
    .clickPlaceOrder()
    .verifydate(month)            //VerifyMonth
    .verifytime(time)             //VerifyTime
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)             //VerifyConfirmationMail
     ;	}
@BeforeClass
public void beforeClass() {
dataSheetName="RegisteredUserPartyOrderPayAtRestaurant";
browserName="chrome";
testCaseName="RegisteredUserPartyOrderPayAtRestaurant";
testDescription="Check whether a Registered user is able to place a Party order and Pay at Restaurant";
}

}
