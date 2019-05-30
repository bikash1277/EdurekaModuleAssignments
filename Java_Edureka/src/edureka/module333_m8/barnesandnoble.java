package edureka.module333_m8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import edureka.module333_m4.BrowserFactory;

public class barnesandnoble extends BrowserFactory {
	public static void main(String[] args) {
		BrowserFactory.getBrowser("Chrome");
		driver.get("https://www.barnesandnoble.com/");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"bx-element-937620-AGprEkq\"]/button")).click();
	}
}
