package Pageobj;

import org.openqa.selenium.WebDriver;

import Interface.Ilogin;

public class LoginPage implements Ilogin{
	public void enterusername(WebDriver driver){
		driver.findElement(username)
	    .sendKeys("devendra30aot");
	}
	
	public void enterpassword(WebDriver driver){
		driver.findElement(password)
	    .sendKeys("myroll30!");
	}
	
	public void clicktosignin(WebDriver driver){
		driver.findElement(signin)
	    .click();
	}
	
	
	
	
}
