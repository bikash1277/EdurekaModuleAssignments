package edureka.module333_m4;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class validatepageObjects{
	Actions myAction;
	Action seriesOfActions;
	
	protected static WebDriver driver;
	String url = "https://www.w3.org/TR/wai-aria-practices/examples/checkbox/checkbox-2/checkbox-2.html";

	public void logintoApplication() throws InterruptedException {
		System.out.println("init Browser");
		System.setProperty("webdriver.chrome.driver", "F:\\Project Related applications\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Browser Initialized!!!");
	}
	public void validateCheckbox() {
		if(driver.findElement(By.xpath("//*[@id=\"cond2\"]")).isSelected())
			driver.findElement(By.xpath("//*[@id=\"cond2\"]")).click();
	}
	public void veriftElementPresent() {
		System.out.println("Element is present::"+driver.findElement(By.xpath("/html/body/main/ul/li/a")).isDisplayed());
	}
	public void testActions() {
		myAction = new Actions(driver);
		seriesOfActions = myAction.moveToElement(driver.findElement(By.xpath("/html/body/main/section[2]/table/tbody/tr[2]/td/ul/li[1]"))).click()
				.sendKeys(Keys.DOWN).sendKeys(Keys.CONTROL)
				.sendKeys("A").sendKeys(Keys.CONTROL).sendKeys(Keys.HOME)
				.build();
		seriesOfActions.perform();
		System.out.println("test Actions Performed!!!");
	}
	public String pageContent() {
		 
		return driver.findElement(By.xpath("/html/body")).getText();
	}
	
	public void ValidateVerbose(String ExpectedText) {
		Assert.assertTrue("Contained Expected Text",pageContent().contains(ExpectedText));
		System.out.println("Expected Text contains in Page!!!");
	}
	public static void main(String[] args) throws InterruptedException {
		validatepageObjects chk=new validatepageObjects();
		chk.logintoApplication();
		chk.validateCheckbox();
		chk.veriftElementPresent();
		chk.ValidateVerbose("Checkbox Example ");
		chk.testActions();
		System.out.println("Page contents is :::"+  chk.pageContent());
	}
	

}
