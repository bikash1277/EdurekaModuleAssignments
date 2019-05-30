package edureka.module333_m5;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import edureka.module333_m4.BrowserFactory;

public class MailCount extends BrowserFactory{

	Actions myAction;
	Action seriesOfActions;
	public void connectMail() {
		driver.get("https://www.gmail.com");
		myAction = new Actions(driver);
		seriesOfActions = myAction.moveToElement(driver.findElement(By.xpath("//*[@id=\"identifierId\"]"))).click()
				.sendKeys("bikashmishra1277").sendKeys(Keys.ENTER).click()
				.build();
		seriesOfActions.perform();
		seriesOfActions=myAction.moveToElement(driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"))).click()
				.sendKeys("PWD").sendKeys(Keys.ENTER)
				.build();
		seriesOfActions.perform();
		System.out.println("test Actions Performed!!!");
	}
	public void validatePrimary() {
		driver.findElement(By.xpath("//*[@id=\":30\"]")).isSelected();
	}
	public static String getMailCount() {
		 String count= (driver.findElement(By.xpath("//*[@class=\"zA yO\"]")).getSize()).toString();
		 
		 return count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		MailCount mail=new MailCount();
		BrowserFactory.getBrowser("Chrome");
		mail.connectMail();
		getMailCount();
	}
}
