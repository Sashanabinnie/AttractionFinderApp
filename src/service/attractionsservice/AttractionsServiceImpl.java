package service.attractionsservice;

import domain.Attractions;
import service.exceptions.AttractionsException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class AttractionsServiceImpl implements IAttractionsService {
	
	/**
	 * Authenticate attraction in application
	 * 
	 * @param Attractions- contains attraction information to be authenticated
	 * @throws AttractionsException
	 *             If the Attractions object in the composite is null or if the
	 *             file that contains the attraction information is not found or
	 *             If an unexpected exception is encountered while accessing the
	 *             file.
	 **/

	public boolean validateAttraction(Attractions attractions) 
			throws AttractionsException {
		
		boolean isValid = false;
		ObjectInputStream input = null;
		try {
		
			input = new ObjectInputStream(new FileInputStream(
					"ValidatedAttraction.out"));
			Attractions validatedAttraction = (Attractions) input.readObject();

			String inAttractions = Attractions.getAttractionName();
			if (inAttractions != null) {
				if (validatedAttraction.equals(inAttractions))
					isValid = true;
				else
					isValid = false;
			} else {
				throw new AttractionsException(
						"Null Attrcation passed to AttractionsServiceImpl");
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("File containing validated attractions not found!");
			throw new AttractionsException( "File containing validated attractions not found!", fnfe );
		} catch (IOException ioe) {
			System.out
					.println("IOException while accessing file containing registered users!");
			throw new AttractionsException(
					"IOException while accessing file containing registered users!",
					ioe);
		} catch (ClassNotFoundException cnfe) { System.out.println("ClassNotFoundException while"
				+ " reading file containing registered users!");
			throw new AttractionsException(
					"ClassNotFoundException while reading file containing validated attractions!",
					cnfe);
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
	
					e.printStackTrace();
				}
			}
		}// end try/catch/finally
		return isValid;
	}

	

}
