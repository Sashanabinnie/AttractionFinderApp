package testimonials.servicelayer.factory;

import testimonials.servicelayer.attractionsservice.*;
import testimonials.servicelayer.customerservice.*;
import testimonials.servicelayer.reviewsservice.*;

public class ServiceFactory {
	
	 public IAttractionsService getAttractionsService()
	   {
	      return new AttractionsServiceImpl();
	   }
	

	 public ICustomerService getCustomerService()
	   {
	      return new CustomerServiceImpl();
	   }
	 
	 public IReviewsService getReviewsService()
	   {
	      return new ReviewsServiceImpl();
	   }
}
