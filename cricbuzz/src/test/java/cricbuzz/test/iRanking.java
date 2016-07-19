package cricbuzz.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface iRanking {
	 By batsmen = By.xpath("//*[@id='batsmen-tab']");
	 By bowlers = By.xpath("//*[@id='bowlers-tab']");
	 public void batsmen_ranking(WebDriver driver);
}
