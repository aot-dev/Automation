package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Live_Score extends HomePage {
	By domestic_live_score = By.xpath(".//*[@id='Domestic-tab']/a");
	public void live_score_of_matches(WebDriver driver) {
		// TODO Auto-generated method stub
		super.live_score_of_matches(driver);
		driver.findElement(domestic_live_score).click();
	}

}
