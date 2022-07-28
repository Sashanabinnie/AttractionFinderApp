package testimonials.service.reviews;

import domain.Reviews;
import junit.framework.TestCase;
import service.exceptions.ReviewsException;
import service.exceptions.ServiceLoadException;
import service.factory.ServiceFactory;
import service.reviewsservice.IReviewsService;
import service.reviewsservice.ReviewsServiceImpl;



public class ReviewsServiceImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private Reviews reviews;


	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = ServiceFactory.getInstance();

		reviews = new Reviews (23232644l, "Best Attrcation Ever", "Sashana Binnie", "July-22-2022", "07:30", 5);

		
	}

	public final void testValidateReviews() {

	
		IReviewsService ReviewsService;
		try {
			ReviewsService = (IReviewsService) serviceFactory
					.getService(IReviewsService.NAME);
			assertTrue(ReviewsService.validateReviews(reviews));
			System.out.println("testAuthenticateCustomer PASSED");
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (ReviewsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("LoginException");

		}

		

		try {
			ReviewsServiceImpl ReviewsServiceImpl = (ReviewsServiceImpl) serviceFactory
					.getService(IReviewsService.NAME);
			assertTrue(ReviewsServiceImpl.validateReviews(reviews));
			System.out.println("testValidateReviews PASSED");
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (ReviewsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ReviewsException");

		}
	}

	
	
	
}