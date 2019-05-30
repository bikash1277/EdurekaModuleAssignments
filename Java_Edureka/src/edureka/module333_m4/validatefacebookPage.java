package edureka.module333_m4;

import org.junit.Assert;
import org.openqa.selenium.By;

public class validatefacebookPage extends BrowserFactory{
	
	public static void logintoApplication(String browserName) throws InterruptedException {
		getBrowser(browserName);
		driver.get("https://facebook.com");
	}
	public void validatePageContents() {
		String Actual=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/div[1]/div[2]")).getText();
		System.out.println("Actual text is ::"+Actual);
		Assert.assertTrue("Expected Matched with Actual Result", Actual.contentEquals("It's free and always will be."));
		String Actual2=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[1]/div/div")).getText();
		System.out.println("Actual text is ::"+Actual2);
		Assert.assertTrue("Expected is Matched with Actual",Actual2.contentEquals("Facebook helps you connect and share with the people in your life."));
		
		
		System.out.println("All text are Matched!!!!");
	}
	public String getTitleFacebook() {
		return driver.getTitle();
	}
	
	public static void main(String[] args) throws InterruptedException {
		validatefacebookPage validate=new validatefacebookPage();
		logintoApplication("Chrome");
		System.out.println("Title of page is ::"+ validate.getTitleFacebook());
		validate.validatePageContents();
	}
}
