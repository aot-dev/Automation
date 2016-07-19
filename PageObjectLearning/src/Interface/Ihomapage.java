package Interface;

import org.openqa.selenium.By;


public interface Ihomapage {
	public By notification = By.xpath("//*[@id='global-actions']/li[2]/a");
	public By home = By.xpath("//*[@id='global-nav-home']/a");
	By searchfield = By.xpath(".//*[@id='search-query']");
	 By searchbutton = By.xpath("//*[@id='global-nav-search']/span/button");
	
}