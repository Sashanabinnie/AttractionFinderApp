package model.service.attractionsservice;

import model.domain.Attractions;
import model.service.IService;
import model.service.exception.AttractionsException;


public interface IAttractionsService extends IService {
	
	public final String NAME = "IAttractionsService";
	
	public boolean validateAttractions(Attractions attractions) throws AttractionsException;

}
