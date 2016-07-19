package cricbuzz.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.By;
import cucumber.annotation.*;
import cucumber.annotation.en.*;

public class cricbuzz_steps {
	protected WebDriver driver;
	By india = By.xpath(".//*[@id='top']/div/div[3]/div/nav/ul/li[7]/ul/li[1]/a");
	Schedule_Page schedule_page = new Schedule_Page();
	Ranking_page ranking_page = new Ranking_page();
	Live_Score live_score = new Live_Score();
	Interview interview = new Interview();
	Teams teams = new Teams();
	
	@Before
	public void setUp() {
	driver = new InternetExplorerDriver();
	}
	@Given("I visit cricbuzz website")
	public void visit_cricbuzz() {
	driver.get("http://www.cricbuzz.com");
	driver.manage().window().maximize();
	}
	@Then("I check schedules for different tournaments")
	public void schedule_of_tournament(){
		schedule_page.schedule(driver);
	}
	@Then("I check rankings for \"([^\"]*)\"")
	public void rankings(String player){
		if (player == "batsmen")
			ranking_page.batsmen_ranking(driver);
		if (player == "bowler")
			ranking_page.bowlers_ranking(driver);
	}
	@Then("I check live score of matches")
	public void live_score_of_matches(){
		live_score.live_score_of_matches(driver);
	}
	@Then("I check different news of cricket")
	public void news_of_cricket(){
		interview.latest_news(driver);
		interview.interview_news(driver);
	}
	@Then("I check updates for few popular teams")
	public void updates_of_popular_teams(){
		teams.team_updates(driver,india);
		teams.team_updates(driver);
	}
	
}
