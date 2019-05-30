package edureka.module333_m7;


import org.testng.annotations.Test;

import edureka.module333_m4.BrowserFactory;

public class dropboxClass extends BrowserFactory{

	@Test(invocationCount=5)
	public void getTitle() {
		BrowserFactory.getBrowser("Chrome");
		driver.get(" https://www.dropbox.com/");
		System.out.println("Page title is ::"+ driver.getTitle());
		driver.close();
	}
	
}
