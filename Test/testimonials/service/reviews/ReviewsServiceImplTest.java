package testimonials.service.reviews;

import junit.framework.TestCase;
import model.domain.Reviews;
import model.service.exception.ReviewsException;
import model.service.exception.ServiceLoadException;
import model.service.factory.ServiceFactory;
import model.service.reviewsservice.IReviewsService;
import model.service.reviewsservice.ReviewsServiceImpl;



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

	
		IReviewsService reviewsService;
		
		try {reviewsService = (IReviewsService) serviceFactory
			.getService(IReviewsService.NAME);
			assertTrue(reviewsService.validateReviews(reviews));
			System.out.println("Test ValidateReviews PASSED");
			
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
			
		} catch (ReviewsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ReviewsException");

		}

		

		try { ReviewsServiceImpl reviewsServiceImpl = (ReviewsServiceImpl) serviceFactory
			.getService(IReviewsService.NAME);
			assertTrue(reviewsServiceImpl.validateReviews(reviews));
			System.out.println("Test ValidateReviews PASSED");
			
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

