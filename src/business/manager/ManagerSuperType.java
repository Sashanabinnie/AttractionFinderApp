package business.manager;

import domain.Attractions;
import business.exception.*;
import service.manager.PropertyManager;


public abstract class ManagerSuperType {

	static
	
		{
    	try
		{
    		ManagerSuperType.loadProperties();  
		}
    	catch (PropertyFileNotFoundException propertyFileNotFoundException)
		{
    	   System.out.println ("Application Properties failed to be loaded - Application exiting...");
    	   System.exit(1); 
		}				
	} 	

	
	public abstract boolean performAction(String commandString, Attractions attractions); 
	
    public static void loadProperties () throws PropertyFileNotFoundException
		{
		
		String propertyFileLocation = System.getProperty("prop_location");
		
        if (propertyFileLocation != null)
        { 
         
          PropertyManager.loadProperties(propertyFileLocation);
        }
        else
        {
          System.out.println("Property file location not set. Passed in value is: " + propertyFileLocation + ".");
          throw new PropertyFileNotFoundException ("Property file location not set", null);         
        }

	}
}
