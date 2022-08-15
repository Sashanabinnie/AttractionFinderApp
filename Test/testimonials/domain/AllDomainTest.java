package testimonials.domain;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllDomainTest {
		
public static Test suite() {
	
	TestSuite suite = new TestSuite("Test for Outsidee Project Domain");
	
	suite.addTestSuite(AttractionsTest.class);
	suite.addTestSuite(ReviewsTest.class);
	suite.addTestSuite(CustomerTest.class);
	return suite;
	
	}
}


