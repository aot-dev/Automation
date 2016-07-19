package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	By schedule_head = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[3]/a");
	By rankings_head = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[9]/a");
	By news_head = By.xpath(".//*[@id='newsDropDown']");
	By teams_head = By.xpath(".//*[@id='teamDropDown']");
	By live_score_head = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[2]/a");
	
	public void live_score_of_matches(WebDriver driver) {
		// TODO Auto-generated method stub
		driver.findElement(live_score_head).click();
	}

}
