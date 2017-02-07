package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;
import wrappers.GenericWrappers;
import org.testng.annotations.BeforeClass;

public class RegUserRegularOrderPayAtRestaurant extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String num,String quantity,String date,String time,String month,String Emailaddr,String Password,String txt) throws InterruptedException {

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
	.enterSnicker(quantity)
    .clickSnickerAddToOrder()
    .clickCheckOut()
    .clickCalendar(date)
    //.clickNext()
    //.clickDate()
    .selectTime(time)
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
dataSheetName="PW004";
browserName="chrome";
testCaseName="RegUserRegularOrderPayAtRestaurant";
testDescription="User Logging in using POM";
}

}
