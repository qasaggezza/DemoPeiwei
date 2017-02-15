package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//This testcase is to check whether a Guest user is able to place a Gift card order with specified Shipping Address and Card amount
//and pay using the credit card. Also check for the confirmation mail from the Restaurant.

public class GuestUserPlaceGiftCard extends PeiweiWrappers{
@Test(dataProvider="fetchData")
public void login(String cval,String quantity,String to,String from,String msg,String fname,String lname,String phone, String addr1, String addr2, String city, String State, String Zip, String Shipmode, String mail,String cname,String cnum,String exdate,String Emailaddr, String Password, String txt) throws InterruptedException {

	new HomePage()
    .clickGiftcard()
    .clickOrdercard()
    .selectCardValue(cval)
	.enterQty(quantity)
	.clicknext()
	.enterTo(to)
	.enterFrom(from)
	.enterMessage(msg)
	.clickPreview()
	.clickAddOrder()
	.verifyQuantity(quantity)       //Verify No.ofcards
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
	.verifyFrom(from)					//Verify Sender 
	.verifyTo(to)						//Verify Receiver
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
    .verifyText(txt)            //VerifyConfirmationMail
     ;
	}
@BeforeClass
public void beforeClass() {
dataSheetName="GuestUserPlaceGiftCard";
browserName="chrome";
testCaseName="GuestUserPlaceGiftCard";
testDescription="Check whether a Guest user is able to place a Gift card order";
}

}