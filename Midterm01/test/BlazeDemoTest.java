import static org.junit.Assert.*;

import java.util.List;

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
		
				List<WebElement> listOfLinks = driver.findElements(By.cssSelector("select option"));
				int numLinks = listOfLinks.size();

				assertEquals(7, numLinks);	
	}

	@Test
	public void teseCase3() {
		
		WebElement button = driver.findElement(By.tagName("input"));
		button.click();
		
//		WebElement choose12 = driver.findElement(By.cssSelector("form#VA12 submit"));
//		choose12.click();	
		
	}
	

}
