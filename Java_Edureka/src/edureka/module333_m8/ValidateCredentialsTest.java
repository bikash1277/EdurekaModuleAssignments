package edureka.module333_m8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import edureka.module333_m4.BrowserFactory;

public class ValidateCredentialsTest extends BrowserFactory {

	public static void validateCredentials() {
		BrowserFactory.getBrowser("Chrome");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("Test");
		driver.findElement(By.xpath("//*[@value='Log In']")).sendKeys(Keys.ENTER);
		String ActualResult = driver.findElement(By.xpath("//*[@id=\"globalContainer\"]/div[3]/div/div/div")).getText();
		String ExpectedResult="The password that you've entered is incorrect. Forgotten password?";

		if(ActualResult.equalsIgnoreCase(ExpectedResult)) {
			Assert.assertTrue(ActualResult==ExpectedResult,"Invalid Credentials");
		}
		else {
			Assert.assertTrue(ActualResult!=ExpectedResult,"Valid Credentials");
		}
		driver.quit();

	}
	public static void main(String[] args) throws Exception {
		validateCredentials();
		
	}

}
