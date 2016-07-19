package Pageobj;

import org.openqa.selenium.WebDriver;

import Interface.Ilogout;

public class Logout implements Ilogout{
	public void signout(WebDriver driver){
		driver.findElement(profile)
	    .click();
		driver.findElement(logout)
	    .click();
	}

}
