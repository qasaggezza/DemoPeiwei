package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class RegUserAddGiftCard extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String emailadd,String pwd,String cval,String quantity,String to,String msg,String fname,String lname,String phone, String addr1, String addr2, String city, String State, String Zip, String Shipmode, String mail,String cname,String cnum,String exdate,String Emailaddr, String Password, String txt) throws InterruptedException {

	new HomePage()
	.clickLogin()
	.enterEmailaddresslogin(emailadd)
	.enterPassword(pwd)
	.clickSubmit()
    .clickGiftcard()
    .clickOrdercard()
    .selectCardValue(cval)
	.enterQty(quantity)
	.clicknext()
	.enterTo(to)
	.enterMessage(msg)
	.clickPreview()
	.clickAddOrder()
	.clickCheckOut()
	.enterFname(fname)
	.enterLname(lname)
	.enterPhone(phone)
	.enterAddr1(addr1)
	.enterAddr2(addr2)
	.enterCity(city)
	.selectState(State)
	.enterZipCode(Zip)
	.selectShippingMethood(Shipmode)
	.enterEmail(mail)
	.clickReview()
	.clickPayNow()
	.enterName(cname)
    .enterCardNumber(cnum)
    .enterExpDate(exdate)
    .clickPayWithCard()
    .InvokeGmail1()
    .enterEmailaddress(Emailaddr)
    .enterNext()
    .enterPassword(Password)
    .clickSignIn()
    .clickUnreadMail()
    .verifyText(txt)
     ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="PW017";
browserName="chrome";
testCaseName="RegUserAddGiftCard";
testDescription="User Logging in using POM";
}

}