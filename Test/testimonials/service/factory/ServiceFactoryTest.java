package testimonials.service.factory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import model.service.attractionsservice.AttractionsServiceImpl;
import model.service.attractionsservice.IAttractionsService;
import model.service.customerservice.CustomerServiceImpl;
import model.service.customerservice.ICustomerService;
import model.service.exception.ServiceLoadException;
import model.service.factory.ServiceFactory;
import model.service.reviewsservice.IReviewsService;
import model.service.reviewsservice.ReviewsServiceImpl;

public class ServiceFactoryTest {

	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = ServiceFactory.getInstance();		
	}
	
	@Test
	public void testGetCustomerService() {
		ICustomerService customerService;
 		
		try { customerService = (ICustomerService)serviceFactory.getService(ICustomerService.NAME);
	  	    assertTrue(customerService instanceof CustomerServiceImpl);
	        System.out.println("Test CustomerService PASSED");
	        
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testGetAttractionsService() {
 		IAttractionsService attractionsService;
 		
		try { attractionsService = (IAttractionsService)serviceFactory.getService(ICustomerService.NAME);
	  	    assertTrue(attractionsService instanceof AttractionsServiceImpl);
	        System.out.println("Test AttractionsService PASSED");
	        
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
	@Test
	public void testGetReviewsService() {
 		IReviewsService reviewsService;
 		
		try { reviewsService = (IReviewsService)serviceFactory.getService(IReviewsService.NAME);
	  	    assertTrue(reviewsService instanceof ReviewsServiceImpl);
	        System.out.println("Test ReviewsService PASSED");
	        
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
}
