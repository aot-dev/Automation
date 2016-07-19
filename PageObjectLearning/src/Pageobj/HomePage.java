package Pageobj;

import org.openqa.selenium.WebDriver;

import Interface.Ihomapage;
import Interface.Ilogin;

public class HomePage implements Ihomapage,Ilogin{
	public void notification(WebDriver driver){
		driver.findElement(notification)
	    .click();
	}

}
