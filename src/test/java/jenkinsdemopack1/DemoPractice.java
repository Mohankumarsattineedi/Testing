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
			
			driver.get("http://www.gmail.com");
			
			
		}
		
		@Test
		public void test() throws InterruptedException{
			
			driver.findElement(By.id("identifierId")).sendKeys("mohankk6993@gmail.com");
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ENTER);
			Thread.sleep(5000);
			
			
			
			//new Comment
			/*
			 * 
			 * new commit has approved to master brances
			 */
		}
		
		
		@AfterTest
		public void tearDown(){
			
			driver.close();
			driver.quit();
		}
		
	}

	
