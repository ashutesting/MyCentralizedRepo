package TestIframe;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Desktop/LocalRepo/Test_Cases_Youtube/Driver/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		List<WebElement> total= driver.findElements(By.tagName("iframe"));
		System.out.println("Total iframes in page are:" +total.size());
		driver.switchTo().frame(0);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		//driver.switchTo().defaultContent();
		driver.close();
		System.out.println("Running Successfully");
	}

}
