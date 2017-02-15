package pages;


	import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import utils.Reporter; 
	import wrappers.PeiweiWrappers;
	public class HomePage extends PeiweiWrappers {

		public HomePage() {
			if(!verifyTitle("Home | Pei Wei Asian Diner")) ;
				//Reporter.reportStep("This is not Home Page", "FAIL");
		}
			
		public Register clickRegister() throws InterruptedException {
		//Thread.sleep(5000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			clickByLink(prop.getProperty("Home.Register.Linktext"));
			return new Register();		
		}

		public HomePage clickLogin() throws InterruptedException {
			//Thread.sleep(3000);
			clickByLink(prop.getProperty("Home.Login.Linktext"));
			return this;
			
		}

		public HomePage enterEmailaddresslogin(String data) {
			enterById(prop.getProperty("Login.Emailaddress.Id"), data);
			return this;
		}

		public HomePage enterPassword(String data) {
			enterById(prop.getProperty("Login.Password.Id"), data);
			return this;
		}
		
		public HomePage clickForgotPwd() {
			clickByLink(prop.getProperty("Login.Forgotpassword.Linktext"));
			return this;
		}
		
		public HomePage clickSubmit2() throws InterruptedException {
			clickByXpath(prop.getProperty("Login.Submit.Xpath"));
			//Thread.sleep(10000);
			return this;
		}
		
		public AccountOverview clickSubmit() throws InterruptedException {
			clickByXpath(prop.getProperty("Login.Submit.Xpath"));
			//Thread.sleep(5000);
			return new AccountOverview();
		}

		public HomePage enterChangeLoc(String loc) throws InterruptedException {
			enterByXpath(prop.getProperty("Home.Location.Xpath"), loc);
			//Thread.sleep(2000);
			return this;
		}
		
		public HomePage clickSearch() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Search.Xpath"));
			//Thread.sleep(3000);
			return this;
		}
		
		public HomePage clickP2labs() throws InterruptedException {
			Thread.sleep(1000);
			clickByXpath(prop.getProperty("Home.P2labs.Xpath"));			
			return this;
		}
		
		public MenuAndOrder clickMenuAndOrd() {
			clickByXpath(prop.getProperty("Home.MenuAndOrder.Xpath"));
			return new MenuAndOrder();
			
			}
		
		public Gmail InvokeGmail2() throws InterruptedException {
			/*System.setProperty("webdriver.chrome.driver", "C://Users/Murugeshwari/Downloads/chromedriver.exe");
		     WebDriver driver = new ChromeDriver();
			 driver.get("https://www.gmail.com");
			 driver.manage().window().maximize();
			 switchToLastWindow();*/
			driver.navigate().to("https://www.gmail.com");
			 //Thread.sleep(2000);
			 return new Gmail();
			}
		
		public FB clickFacebook() throws InterruptedException {
			Thread.sleep(2000);
			clickByXpath(prop.getProperty("Home.Facebook.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new FB();
		}
		
		public Twitter clickTwitter() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Twitter.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Twitter();
		}
		public Pinterest clickPinterest() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Pinterest.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Pinterest();
		}
		public Googleplus clickGoogleplus() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Googleplus.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Googleplus();
		}
		public Instagram clickInstagram() throws InterruptedException {
			clickByXpath(prop.getProperty("Home.Instagram.Xpath"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Instagram();
		}
		
		public Contactus clickContactus() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Contactus.Linktext"));
			//Thread.sleep(5000);
			return new Contactus();
		}
		public Sitemap clickSitemap() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Sitemap.Linktext"));
			//Thread.sleep(5000);
			return new Sitemap();
		}
		public AllLocations clickAllloc() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Allloc.Linktext"));
			//Thread.sleep(5000);
			return new AllLocations();
		}
		public Careers clickCareers() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Careers.Linktext"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Careers();
		}
		public PeiweiLocal clickPeiweilocal() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Peiweilocal.Linktext"));
			//Thread.sleep(5000);
			return new PeiweiLocal();
		}
		public Investors clickInvestors() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Investors.Linktext"));
			switchToLastWindow();
			//Thread.sleep(5000);
			return new Investors();
		}
		public Media clickMedia() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Media.Linktext"));
			//Thread.sleep(5000);
			return new Media();
		}
		public PrivacyPolicy clickPrivacy() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Privacy.Linktext"));
			//Thread.sleep(5000);
			return new PrivacyPolicy();
		}
		public Terms clickTerms() throws InterruptedException {
			clickByLink(prop.getProperty("Home.Terms.Linktext"));
			//Thread.sleep(5000);
			return new Terms();
		}
	
		public GlobalInvestments clickGlobalInvestments() throws InterruptedException {
			clickByLink(prop.getProperty("Home.GlobalInvestments.Linktext"));
			//Thread.sleep(5000);
			return new GlobalInvestments();
		}
		
		public GiftCard clickGiftcard(){
			clickByXpath(prop.getProperty("AccountOverview.Giftcards.Xpath"));
			return new GiftCard();
		}
		
		
		
	}

