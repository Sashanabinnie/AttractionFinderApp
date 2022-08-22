package testimonials.domain;

import org.junit.Before;
import junit.framework.TestCase;
import model.domain.Reviews;

import org.junit.Test;

public class ReviewsTest extends TestCase{


	Reviews r1;
	Reviews r2;
	Reviews r3;

	@Before
	public void setUp() throws Exception {
		
		 r1 = new Reviews (10008968l, "Best Attraction of the Year!", "Sashana Binie", "July-25-2022", "10:30", 5);
		 r2 = new Reviews (10008968l, "Best Attraction of the Year!", "Sashana Binie", "July-25-2022", "10:30", 5);
		 r3 = new Reviews (10004545l, "Horrible Attraction", "Ashley Bob", "July-11-2022", "11:30", 1);
		
	}
		
	@Test //Test for a valid Reviews
	 public void validTest(){
		
		assertTrue ("r1 Validation", r1.validation());   
		System.out.println("Validation Test Passed");
	}
	
		
	@Test //Test for an invalid Reviews
	public void nonValidTest() {
		assertFalse ("r1 Not Valid ", r1.validation());
	    System.out.println("Validation Test Not Passed");	
		
	}
	@Test //Test for equality
	public void testEquals() {
		assert (r1.equals(r2));
		  System.out.println("Equality Test Passed");
		  
		assertFalse (r2.equals(r3));
		  System.out.println("Validation Test Not Passed");
	}
}
