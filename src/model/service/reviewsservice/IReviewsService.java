package model.service.reviewsservice;

import model.domain.Reviews;
import model.service.IService;
import model.service.exception.ReviewsException;



public interface IReviewsService extends IService {
	
public final String NAME = "IReviewsService";
	
	
	public boolean validateReviews(Reviews reviews) throws ReviewsException;


}
