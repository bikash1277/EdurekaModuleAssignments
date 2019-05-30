package edureka.module333_m3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginFacebook {
	protected static WebDriver driver;
	String url = "http://newtours.demoaut.com/";

	public loginFacebook() throws InterruptedException {
		System.out.println("init Browser");
		System.setProperty("webdriver.chrome.driver", "F:\\Project Related applications\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		System.out.println("Browser Initialized!!!");
	}

	public void FacebookLogin() throws InterruptedException {
		driver.findElement(By.cssSelector("#email")).sendKeys("UserName");
		driver.findElement(By.cssSelector("#pass")).sendKeys("Password");
		driver.findElement(By.cssSelector("#u_0_2")).click();
		System.out.println("Log in Successfully!!!");
	}

	public void quitBrowser() {
		driver.quit();
		System.out.println("Browse closed!!!");
	}

	public void PageNavigation(String command) {
		if (command.equalsIgnoreCase("back"))
			driver.navigate().back();
		else if (command.equalsIgnoreCase("refresh"))
			driver.navigate().refresh();
		else if(command.equalsIgnoreCase("next"))
			driver.navigate().forward();
		
		System.out.println("Page Naviagtion occured!!!!");
	}

	public static void main(String[] args) throws InterruptedException {
		loginFacebook login = new loginFacebook();
		login.FacebookLogin();
		login.PageNavigation("back");
//		 login.quitBrowser();
	}

}
