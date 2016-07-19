package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Interview extends News{
	private By interview_head = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[5]/ul/li[6]/a");
	public void interview_news(WebDriver driver){
		driver.findElement(news_head).click();
		driver.findElement(interview_head).click();
		
	}
}
