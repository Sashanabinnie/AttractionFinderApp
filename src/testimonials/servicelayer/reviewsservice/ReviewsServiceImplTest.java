package testimonials.servicelayer.reviewsservice;

import junit.framework.TestCase;
import testimonials.domainlayer.*;
import testimonials.servicelayer.factory.*;

public class ReviewsServiceImplTest extends TestCase {

	private ServiceFactory ServiceFactory;
	private Reviews reviews;

	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = new ServiceFactory();

		reviews = new Reviews("001", "Sashana", "Binnie", "Sashanab",
				"2022-07-18", "06.30");

	}
		public final void testreviews() {

			ReviewsService reviewsService = serviceFactory.getreviewsService();
			assertTrue(reviewsService.authenticatereviews(reviews));
			System.out.println("testAuthenticatereviews PASSED");

			ReviewsServiceImpl reviewsServiceImpl = (ReviewsServiceImpl) serviceFactory
					.getreviewsService();
			assertTrue(ReviewsServiceImpl.authenticateReviews(reviews));
			System.out.println("testAuthenticatereviews PASSED");
		
	}
	
}