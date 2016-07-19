package Interface;

import org.openqa.selenium.By;

public interface Ilogin {
	public By username = By.xpath("//*[@id='signin-email']");
	public By password = By.xpath("//*[@id='signin-password']");
	public By signin = By.xpath("//*[@id='front-container']/div[2]/div[2]/form/table/tbody/tr/td[2]/button");
}
