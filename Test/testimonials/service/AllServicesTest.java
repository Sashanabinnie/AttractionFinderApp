package testimonials.service;

import junit.framework.TestCase;
import model.service.factory.ServiceFactory;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import testimonials.service.customer.CustomerServiceImplTest;
import testimonials.service.reviews.ReviewsServiceImplTest;
import testimonials.service.attractions.AttractionsServiceImplTest;


@RunWith(Suite.class)
@SuiteClasses({ ServiceFactory.class, CustomerServiceImplTest.class, ReviewsServiceImplTest.class,
	AttractionsServiceImplTest.class})

public class AllServicesTest extends TestCase {
	
	

}
