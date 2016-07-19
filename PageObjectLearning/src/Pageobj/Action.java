package Pageobj;

import org.openqa.selenium.WebDriver;

import Interface.Ihomapage;
import Interface.Itweet;

public class Action extends Activities implements Ihomapage, Itweet{
	public void search(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(searchfield)
	    .sendKeys("virat kohli");
		driver.findElement(searchbutton)
	    .click();
		
	}
    public void tweet(WebDriver driver){
    	driver.findElement(tweettab)
	    .click();
    	driver.findElement(tweetfield)
	    .sendKeys("I don't want to tweet!:D");
    	driver.findElement(tweetquit)
	    .click();
    	
    }
    public void news(WebDriver driver){
		super.news(driver);
		driver.findElement(home)
	    .click();
	
	}

		

}
