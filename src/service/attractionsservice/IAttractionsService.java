package service.attractionsservice;

import domain.Attractions;
import service.IService;
import service.exceptions.*;

public interface IAttractionsService extends IService {
	
	public final String NAME = "IAttractionsService";
	
	/** 
	 * Validate that attraction has been created into our application 
	 * @param Attractions - contains attraction information to be validated 
	 * @throws LoginException 
	 * 							If the Attraction object is null or
	 *   				        If the file that contains the attraction information is not found or
	 *   					    If an unexpected exception is encountered while accessing the attraction file.
	 * @return boolean
	 * 					true - if validated
	 * 				    false - if failed to validate
	 * */
	
	public boolean validateAttraction(Attractions attractions) throws AttractionsException;

}
