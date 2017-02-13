package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;
import wrappers.GenericWrappers;
import org.testng.annotations.BeforeClass;

public class RegUserRegularOrderMultipleQuantity extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String num1,String num2,String rice, String qua,String date,String time,String month,String Emailaddr,String Password,String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
	.clickMenuAndOrder()
	.clickRiceAndNoodle()
	.clickHoneySeared()
	.enterQuantity(num)
	.clickSize1()
	.clickIngredient()
	.clickServedWith1()
	.clickAddToOrder()
	.clickKeepLooking()
	.clickJapeneseSteak()
	.enterQuantity(num1)
	//.clickSize1()
	//.clickIngredient()
	//.clickServedWith1()
	.clickAddToOrder()
	.clickKeepLooking()
	.clickOrangePeel()
	.enterQuantity(num2)
	//.clickSize1()
	.clickIngredient()
	.clickServedWith1()
	.clickAddToOrder()
	.clickCheckOut()
	.selectRice(rice)
	.enterQuan(qua)
    .clickRiceAddToOrder()
    .getTotal()
    .clickCheckOut()
    .clickCalendar(date)
    //.clickNext()
    //.clickDate()
    .selectTime(time)
    .getTotal1()
    .getTotal2()
    .clickPlaceOrder()
    .verifydate(month)
    .verifytime(time)
    .getTotal()
  /*  .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText1(txt)  */
    ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="PW021";
browserName="chrome";
testCaseName="RegUserRegularOrderMultipleQuantity";
testDescription="User Logging in using POM";
}

}
