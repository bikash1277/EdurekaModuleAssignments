package edureka.module333_m4;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

	private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();
	private static String driverpath=System.getProperty("user.dir")+"\\resources\\";
	protected static WebDriver driver = null;
	/*
	 * Factory method for getting browsers
	 */
	public static WebDriver getBrowser(String browserName) {
		
		switch (browserName) {
		case "Firefox":
			driver = drivers.get("Firefox");
			if (driver == null) {
				System.setProperty("webdriver.gecko.driver", driverpath+"geckodriver.exe");
				driver = new FirefoxDriver();
				drivers.put("Firefox", driver);
			}
			break;
		case "IE":
			driver = drivers.get("IE");
			if (driver == null) {
				System.setProperty("webdriver.ie.driver", driverpath+"IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				drivers.put("IE", driver);
			}
			break;
		case "Chrome":
			driver = drivers.get("Chrome");
			if (driver == null) {
				System.setProperty("webdriver.chrome.driver", driverpath+"chromeDriver.exe");
				driver = new ChromeDriver();
				drivers.put("Chrome", driver);
			}
			break;
			default:
				System.out.println("Incorrect browser Name!!!!");		
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
	}

	public static void closeAllDriver() {
		for (String key : drivers.keySet()) {
			drivers.get(key).close();
			drivers.get(key).quit();
		}
	}
}