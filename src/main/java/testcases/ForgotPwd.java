package testcases;

    import org.testng.annotations.Test;


    import pages.HomePage;
   // import pages.Login;
    //import pages.Register;
    import wrappers.PeiweiWrappers;

    import org.testng.annotations.BeforeClass;

    public class ForgotPwd extends PeiweiWrappers{
    @Test(dataProvider="fetchData")
    public void login(String emailadd,String Emailaddr, String Password,String pass1, String pass2) throws InterruptedException {

    	new HomePage()
    	.clickLogin()
    	.enterEmailaddresslogin(emailadd)
    	.clickForgotPwd()
    	.clickSubmit2()
    	.InvokeGmail2()
    	.enterEmailaddress(Emailaddr)
    	.enterNext()
    	.enterPassword(Password)
    	.clickSignIn()
    	.clickUnreadMail()
    	.clickLink()
    	.enterPassword1(pass1)
    	.enterPassword2(pass2)
    	.clickSubmit()
    	.switchback()
    	.clickInbox()
    	.clickUnreadMail1()
    	;
    
         	}
    @BeforeClass
    public void beforeClass() {
    dataSheetName="PW003";
    browserName="chrome";
    testCaseName="ForgotPwd";
    testDescription="User Logging in using POM";
    }

    }