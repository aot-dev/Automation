package webDriverFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pageobj.HomePage;
import Pageobj.LoginPage;

public class WaitStatement {
	By home = By.xpath("//*[@id='global-nav-home']/a");
	LoginPage loginpage =new LoginPage();
	HomePage homepage = new HomePage();
	
	void implicitmethod(WebDriver driver){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://twitter.com");
		loginpage.enterusername(driver);
		
		loginpage.enterpassword(driver);
		
		loginpage.clicktosignin(driver);
		
	}
	void explicitmethod(WebDriver driver,By profilepic){
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(profilepic));
        homepage.notification(driver);
        homepage.notification(driver);
        
	}
	void explicitmethod(WebDriver driver,By profilepic,By searchfield){
		driver.findElement(home)
	    .click();
		WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(profilepic));
		driver.findElement(searchfield)
	    .sendKeys("David Warner");
		
	}
}
