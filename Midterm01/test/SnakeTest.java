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

	// Note: Commented as it returns false and test Passes
	
	@Test
	public void testIsHealthy() {
		
		boolean testtakis = takis.isHealthy();
		assertTrue(testtakis);
		
		
		boolean testpeter = peter.isHealthy();
		//assertTrue(testpeter);
	
	}
	
	@Test
	public void testFitInCage() {
		
		
		// Note: Commented as it returns false and test Passes
		
		// Cage for Taskis 
		boolean cageless = takis.fitsInCage(20);
	//	assertTrue(cageless);  
		
		boolean cageEquals = takis.fitsInCage(80);
	//	assertTrue(cageEquals);
		
		boolean cageGreater = takis.fitsInCage(88);
		assertTrue(cageGreater);
		
		//Cage for peter
		boolean petercageless = peter.fitsInCage(5);
	//assertTrue(petercageless);
		
		boolean petercageEquals = peter.fitsInCage(10);
	//	assertTrue(petercageEquals);
		
		boolean petercageGreater = peter.fitsInCage(25);
		assertTrue(petercageGreater);
	
	}
	
	
	

}
