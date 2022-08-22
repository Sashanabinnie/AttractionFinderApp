package testimonials.domain;

import org.junit.Before;
import junit.framework.TestCase;
import model.domain.Customer;

import org.junit.Test;

public class CustomerTest extends TestCase {

	Customer c1;
	Customer c2;
	Customer c3;

	@Before
	public void setUp() throws Exception {
		
		c1 = new Customer (10006565l, "Sashana", "Binnie", "Sashanaab", "July-24-2022", "07:30" );
		c2 = new Customer (10006565l, "Sashana", "Binnie", "Sashanaab", "July-24-2022", "07:30" );
		c3 = new Customer (100065677l, "Ashley", "Brown", "Ashley876", "July-20-2022", "09:30" );
		
	}
		
	@Test //Test for a valid Customer
	 public void validTest(){
		
		assertTrue ("c1 Validation", c1.validation());   
		System.out.println("Validation Test Passed");
	}
	
		
	@Test //Test for an invalid Customer
	public void nonValidTest() {
		assertFalse ("c1 Not Valid ", c1.validation());
	    System.out.println("Validation Test Not Passed");	
		
	}
	@Test //Test for equality
	public void testEquals() {
		assert (c1.equals(c2));
		  System.out.println("Equality Test Passed");
		  
		assertFalse (c2.equals(c3));
		  System.out.println("Validation Test Not Passed");
	}
}
