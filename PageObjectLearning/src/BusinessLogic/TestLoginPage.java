package BusinessLogic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobj.Action;
import Pageobj.HomePage;
import Pageobj.LoginPage;
import Pageobj.Logout;

public class TestLoginPage{
	public static void main(String [] args) throws InterruptedException {
	WebDriver driver = new FirefoxDriver();
	LoginPage loginpage =new LoginPage();
	HomePage homepage = new HomePage();
	Action action = new Action();
	Logout logout = new Logout();
	driver.get("https://twitter.com");
	
	driver.manage().window().maximize();
	
	WebDriverWait wait = new WebDriverWait(driver,30);
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='signin-password']")));

	loginpage.enterusername(driver);
	
	loginpage.enterpassword(driver);
	
	loginpage.clicktosignin(driver);
	
	homepage.notification(driver);
	
	action.tweet(driver);
	
	action.search(driver);
	
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='page-container']/div[2]/div[1]/ul/li[3]/a")));
	
	action.news(driver);
	
	logout.signout(driver);
	driver.close();
	
	}
}
