package webDriverFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

		public static void main(String[] args) {
			WebDriver driver = new FirefoxDriver();
		// TODO Auto-generated method stub
			By profilepic = By.xpath("//*[@id='page-container']/div[1]/div[1]/div/a/img");
			By searchfield = By.xpath(".//*[@id='search-query']");
				WaitStatement obj = new WaitStatement();
				obj.implicitmethod(driver);
				obj.explicitmethod(driver,profilepic);
				obj.explicitmethod(driver,profilepic, searchfield);
	}

}
