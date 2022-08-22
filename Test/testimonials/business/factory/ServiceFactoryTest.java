package testimonials.business.factory;

import junit.framework.TestCase;
import model.service.exception.ServiceLoadException;
import model.service.factory.ServiceFactory;
import model.service.reviewsservice.IReviewsService;
import model.service.reviewsservice.ReviewsServiceImpl;



public class ServiceFactoryTest extends TestCase {

		ServiceFactory serviceFactory;
		
		public void setUp() throws Exception {
			serviceFactory = ServiceFactory.getInstance();
			
			}

		public void testGetInstance() {
		       assertNotNull(serviceFactory);
			}
		
	 
		public void testGetReviewsService() {
	 		
			IReviewsService reviewsService;
			try {
				reviewsService = (IReviewsService)serviceFactory.getService(IReviewsService.NAME);
		  	    assertTrue(reviewsService instanceof ReviewsServiceImpl);
		
			} catch (ServiceLoadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				fail("ServiceLoadException");
			}
		}
}
