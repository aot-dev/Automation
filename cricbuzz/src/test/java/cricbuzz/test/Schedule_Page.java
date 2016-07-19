package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Schedule_Page {
	private By schedule_head = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[3]/a");
	private By international = By.xpath("//*[@id='International-tab']/a");
	private By t20league = By.xpath(".//*[@id='League-tab']/a");
	private By domestic = By.xpath(".//*[@id='Domestic-tab']/a");
	private By all = By.xpath(".//*[@id='All-tab']/a");
	
	public void schedule(WebDriver driver){
		driver.findElement(schedule_head).click();
		driver.findElement(international).click();
		driver.findElement(t20league).click();
		driver.findElement(domestic).click();
		driver.findElement(all).click();
	}

}
