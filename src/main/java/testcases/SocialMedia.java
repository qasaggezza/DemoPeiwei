package testcases;
import org.testng.annotations.Test;


import pages.HomePage;
// import pages.Login;
//import pages.Register;
import wrappers.PeiweiWrappers;

import org.testng.annotations.BeforeClass;

//This testcase is to check whether a user is able to click and navigate to the social media icons available.

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
browserName="chrome";
testCaseName="SocialMedia";
testDescription="Check whether the user is able to click and navigate to the social media icons available.";
}

}
