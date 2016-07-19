package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class News {
	 By news_head = By.xpath(".//*[@id='newsDropDown']");
	 By latest = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[5]/ul/li[1]/a");
	public abstract void interview_news(WebDriver driver);
	public void latest_news(WebDriver driver){
		driver.findElement(news_head).click();
		driver.findElement(latest).click();
	}
}
