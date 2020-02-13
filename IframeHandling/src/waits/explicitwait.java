package waits;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait 
{
	WebDriver driver;
	@Test
	public void explicit()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/AshishSoni/Desktop/LocalRepo/Test_Cases_Youtube/Driver/chromedriver");
		driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		System.out.println(driver.getTitle());
		String etitle= "Demo Guru99 Page";
		String atitle= "";
		atitle= driver.getTitle();
		if(etitle.contentEquals(atitle))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		WebElement seleniumclick= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//i[@class='icon-wrench']")));
		seleniumclick.click();
		System.out.println("Running Successfully and explicit wait tested");
		driver.close();
	
		
	}

}
