package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Teams extends HomePage{
	private By australia = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[7]/ul/li[3]/a");
	public void team_updates(WebDriver driver, By india){
		driver.findElement(teams_head).click();
		driver.findElement(india).click();
	}

	public void team_updates(WebDriver driver) {
		driver.findElement(teams_head).click();
		driver.findElement(australia).click();
	}
}
