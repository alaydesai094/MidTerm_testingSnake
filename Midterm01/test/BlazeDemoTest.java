import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BlazeDemoTest {
	
	final String URL = "http://blazedemo.com/";
	final String DRIVER_PATH = "/Users/macstudent/Desktop/chromedriver";

	WebDriver driver;
	
	@Before
	public void setUp() throws Exception {
		
		// Setup Selenium + Chrome
				System.setProperty("webdriver.chrome.driver",DRIVER_PATH);
				driver = new ChromeDriver();
				
				// Tell Selenium what page to test
				driver.get(URL);
						
	}

	@After
	public void tearDown() throws Exception {
		// At end of test case, wait for a few seconds, then close the browser
				Thread.sleep(1000);						
	}

	@Test
	public void teseCase1() {
		String link = "destination of the week! The Beach!"; 
		WebElement element = driver.findElement(By.linkText(link));
		element.click();	
	}
	
	@Test
	public void teseCase2() {
		String link = "destination of the week! The Beach!"; 
		WebElement element = driver.findElement(By.linkText(link));
		element.click();	
	}


}
