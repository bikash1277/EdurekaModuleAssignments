package edureka.module333_m6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import edureka.module333_m4.BrowserFactory;

public class facebookLinks extends BrowserFactory{

	public void validatePageLink() {
		driver.get("https://www.facebook.com/");
		List<WebElement> links=driver.findElements(By.xpath("//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i']/li/a"));
		System.out.println("Size of Link Text is ::"+links.size());
		
		for (int i =0; i<links.size();i++)
		{
			System.out.print(links.get(i).getText()+":-");
			System.out.println(links.get(i).getAttribute("href"));
			if(links.get(i).getAttribute("href").isEmpty())
			System.out.println("Link is not present!!!!");
		}
		
	}
	public static void main(String[] args)throws Exception {
		facebookLinks facebook=new facebookLinks();
		BrowserFactory.getBrowser("Chrome");
		facebook.validatePageLink();
//		driver.quit();
	}
}
