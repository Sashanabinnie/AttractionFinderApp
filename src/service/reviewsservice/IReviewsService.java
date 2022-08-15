package service.reviewsservice;

import domain.Reviews;
import service.IService;
import service.exceptions.*;


public interface IReviewsService extends IService {
	
public final String NAME = "IReviewsService";
	
	
	public boolean validateReviews(Reviews reviews) throws ReviewsException;


}
