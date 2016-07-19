package Pageobj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class Activities {
	protected By newstab = By.xpath(".//*[@id='page-container']/div[2]/div[1]/ul/li[3]/a");
	abstract void search(WebDriver driver);
	public void news(WebDriver driver){
		driver.findElement(newstab)
	    .click();
	}


}
