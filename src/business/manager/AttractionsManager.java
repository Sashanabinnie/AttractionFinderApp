package business.manager;

import domain.Attractions;
import domain.Reviews;
import business.exception.*;
import business.exception.ServiceLoadException;
import service.exceptions.AttractionsException;
import service.exceptions.ReviewsException;
import service.reviewsservice.IReviewsService;
import business.manager.*;
import service.exceptions.*;
import service.attractionsservice.*;
import service.factory.*;
import service.reviewsservice.*;
import service.IService;

public class AttractionsManager extends ManagerSuperType {

	private static AttractionsManager _instance;
	
	private AttractionsManager() {
		
	}

	public static synchronized AttractionsManager getInstance() {
		
		if (_instance == null) {
			_instance = new AttractionsManager();
		}
		return _instance;
	}

	@Override
	public boolean performAction (String commandString, Attractions attractions) {
		
		boolean action = false;
		
		if (commandString.equals("ValidateReviews")) 
		{
			action = validateReviews(IReviewsService.NAME, attractions);
		}   
		return action;
	}
	
	
	public boolean validateReviews(String commandString, Attractions attractions) {
		
		boolean isValidated = false;
		ServiceFactory serviceFactory = ServiceFactory.getInstance();
		IReviewsService iReviewsService;
		try {iReviewsService = (IReviewsService) serviceFactory
				.getService(commandString);
			isValidated = iReviewsService
					.validateReviews();
		} catch (ServiceLoadException e1) {
			System.out.println("AttractionsManger::validateReviews failed"); 
					
		} catch (ReviewsException e) {
			System.out.println("AttractionsManager::validateReviews failed"); 
																				
		}

		return isValidated;
	}
	
	
	public static void main(String[] args) {

		AttractionsManager attractionsManager = AttractionsManager.getInstance();
		
		Reviews reviews = new Reviews (65656564l, "Best hiking trail ever", "Sashana Binnie",
				"July-24-2022", "07:30AM", 5);
		Attractions attractions = new Attractions();
		attractions.setReviews(reviews);

		boolean isValidated = attractionsManager.performAction(
				"ValidateReviews", attractions);

		String message = isValidated ? "AttractionsManager::main - Successfully validated reviews"
				: "AttractionsManager::main - Failed to validate reviews";
		System.out.println(message);

	} 
	
}


