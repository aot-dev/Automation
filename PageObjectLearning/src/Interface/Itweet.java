package Interface;

import org.openqa.selenium.By;

public interface Itweet {
	public By tweettab = By.xpath("//*[@id='global-new-tweet-button']");
	public By tweetfield = By.xpath("//*[@id='tweet-box-global']");
	public By tweetquit = By.xpath("//*[@id='global-tweet-dialog-dialog']/button");
}
