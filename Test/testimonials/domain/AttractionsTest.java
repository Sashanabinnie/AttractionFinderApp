package testimonials.domain;

import static org.junit.Assert.assertFalse;
import org.junit.Before;
import org.junit.Test;

import domain.Attractions;

class AttractionsTest {
	
	Attractions a1;
	Attractions a2;
	Attractions a3;

	@Before
	public void setUp() throws Exception {
		
		a1 = new Attractions (1000001l, "TalcottMountatin", "Hiking Trail", "Sashana Binnie", "24", "July", "2022", "07:30" );
		a2 = new Attractions (1000001l, "TalcottMountatin", "Hiking Trail", "Sashana Binnie", "24", "July", "2022", "07:30" );
		a3 = new Attractions (1000003l, "Reservoir", "Hiking Trail", "Binnie Ashley", "16", "June", "2022", "07:30" );
		
	}
	 @Test	
	//Test for a valid attraction
	 public void validTest() {
		assert (a1.validation());  
		assert (a2.validation()); 
		System.out.println("Validation Test Passed");
	}
	
		
	@Test //Test for an invalid attraction
	public void nonValidTest() {
		assertFalse ("a3 Not Valid ", a3.validation());
	    System.out.println("Validation Test Not Passed");	
		
	}
	@Test //Test for equality
	public void testEquals() {
		assert (a1.equals(a2));
		  System.out.println("Equality Test Passed");
		  
		assert (a2.equals(a3));
		  System.out.println("Validation Test Not Passed");
	}
}
