package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Ranking_page extends HomePage implements iRanking {
		
		private By batsmen_tests = By.xpath("//*[@id='batsmen-tab']");
		private By batsmen_odis = By.xpath("//*[@id='batsmen-tab']");
		private By batsmen_t20s = By.xpath("//*[@id='batsmen-tab']");
		
		private By bowlers_tests = By.xpath("//*[@id='bowlers-tab']");
		private By bowlers_odis = By.xpath("//*[@id='bowlers-tab']");
		private By bowlers_t20s = By.xpath("//*[@id='bowlers-tab']");
		
		public void batsmen_ranking(WebDriver driver){
			driver.findElement(rankings_head).click();
			driver.findElement(batsmen).click();
			driver.findElement(batsmen_tests).click();
			driver.findElement(batsmen_odis).click();
			driver.findElement(batsmen_t20s).click();
		}
		public void bowlers_ranking(WebDriver driver){
			driver.findElement(rankings_head).click();
			driver.findElement(bowlers).click();
			driver.findElement(bowlers_tests).click();
			driver.findElement(bowlers_odis).click();
			driver.findElement(bowlers_t20s).click();
		}
		
}
