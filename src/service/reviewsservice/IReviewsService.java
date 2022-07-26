package service.reviewsservice;

import domain.Reviews;
import service.IService;
import service.exceptions.*;


public interface IReviewsService extends IService {
	
public final String NAME = "IReviewsService";
	
	/** 
	 * Validate that review has been created into our application 
	 * @param Reviews - contains attraction information to be validated 
	 * @throws LoginException 
	 * 							If the Reviews object is null or
	 *   				        If the file that contains the review information is not found or
	 *   					    If an unexpected exception is encountered while accessing the review file.
	 * @return boolean
	 * 					true - if validated
	 * 				    false - if failed to validate
	 * */
	
	public boolean validateReviews(Reviews Reviews) throws ReviewsException;
}
