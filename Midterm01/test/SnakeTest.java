// Student Name : Alay Desai
// ID : C0735979

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SnakeTest {
	
	private Snake peter;
	private Snake takis;

	@Before
	public void setUp() throws Exception {
		peter = new Snake("Peter S", 10, "coffee");
		takis = new Snake("Takis Z", 80, "vegetables");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsHealthy() {
		
		boolean testtakis = takis.isHealthy();
		assertTrue(testtakis);
		
		
		boolean testpeter = peter.isHealthy();
		assertTrue(testpeter);
	
	}
	
	@Test
	public void testFitInCage() {
		
		boolean testtakis = takis.isHealthy();
		assertTrue(testtakis);
		
		
		boolean testpeter = peter.isHealthy();
		assertTrue(testpeter);
	
	}
	
	
	

}
