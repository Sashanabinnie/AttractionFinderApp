package service.attractionsservice;

import domain.Attractions;
import service.IService;
import service.exceptions.*;

public interface IAttractionsService extends IService {
	
	public final String NAME = "IAttractionsService";
	
	public boolean validateAttractions(Attractions attractions) throws AttractionsException;

}
