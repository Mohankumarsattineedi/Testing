package jenkinsdemopack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
	

public class DemoPractice {
		
		WebDriver driver;
		
		@BeforeTest
		public void Launch(){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			driver.get("https://www.google.com/");
			
			
		}
		
		@Test
		public void test() throws InterruptedException{
			
			driver.findElement(By.name("a")).sendKeys("New Movies List");
			Actions act = new Actions(driver);
			act.sendKeys(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			
			
		}
		
		
		@AfterTest
		public void tearDown(){
			
			driver.close();
			
		}
		
	}

	
