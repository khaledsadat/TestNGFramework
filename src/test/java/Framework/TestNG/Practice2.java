package Framework.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice2 {
	
	
	// go to laptop page, add 3 items to the card and verify that they are added to the cart

	
	WebDriver driver;

	@BeforeMethod
	public void setEnviroment() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);

	}

	@Test

	public void addToShoppingCartItem1() {

		driver.get("https://www.tekschoolofamerica.com/test-environment/index.php?route=product/category&path=18");
	    driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[1]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[4]/div[3]/div/div[1]/a/img")).click();
		driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
		
		
	}
	
	
	

//
//	@AfterMethod
//	public void closeTheEnviroment() {
//		driver.close();
//		driver.quit();
//	}

	
}

