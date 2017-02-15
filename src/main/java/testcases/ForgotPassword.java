package testcases;

    import org.testng.annotations.Test;


    import pages.HomePage;
   // import pages.Login;
    //import pages.Register;
    import wrappers.PeiweiWrappers;

    import org.testng.annotations.BeforeClass;

    //This testcase is to check if forgot password link on login screen works as expected. On clicking forgot password link, 
    //user should be able to reset the password and should be able to login with the newly changed password. 
    
    
    public class ForgotPassword extends PeiweiWrappers{
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
    	.verifyMailId(emailadd)        //VerifyEmailId
    	.switchback()
    	.clickInbox()
    	.clickUnreadMail1()
    	;
    
         	}
    @BeforeClass
    public void beforeClass() {
    dataSheetName="ForgotPassword";
    browserName="chrome";
    testCaseName="ForgotPassword";
    testDescription="Verify Forgot Password Functionality";
    }

    }