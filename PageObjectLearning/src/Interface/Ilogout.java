package Interface;

import org.openqa.selenium.By;

public interface Ilogout {
	public By profile = By.xpath("//*[@id='user-dropdown-toggle']");
	public By logout = By.xpath("//*[@id='signout-button']/button");

}
