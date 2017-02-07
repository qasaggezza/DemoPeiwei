package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

public class SocialMedia extends PeiweiWrappers{
@Test
public void login() throws InterruptedException {

	new HomePage()
	.clickFacebook()
    .switchback()
    .clickTwitter()
    .switchback()
    .clickGoogleplus()
    .switchback()
    .clickPinterest()
    .switchback()
    .clickInstagram()
    .switchback()
	;
    
	}
@BeforeClass
public void beforeClass() {
//dataSheetName="PW003";
browserName="chrome";
testCaseName="SocialMedia";
testDescription="User Logging in using POM";
}

}
