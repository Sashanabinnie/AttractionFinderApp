package model.service.attractionsservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.domain.Attractions;
import model.service.exception.AttractionsException;


public class AttractionsServiceImpl implements IAttractionsService {
	

	@SuppressWarnings("unlikely-arg-type")
	public boolean validateAttraction(Attractions attractions) 
			throws AttractionsException {
		
		boolean isValid = false;
		ObjectInputStream input = null;
		try {
		
			input = new ObjectInputStream(new FileInputStream(
					"ValidatedAttraction.out"));
			Attractions validatedAttraction = (Attractions) input.readObject();

			String inAttractions = new String();
			if (validatedAttraction.equals(inAttractions))
				isValid = true;
			else
				isValid = false;
		} catch (FileNotFoundException fnfe) {
			System.out.println("File containing validated attractions not found!");
			throw new AttractionsException( "File containing validated attractions not found!" );
		} catch (IOException ioe) {
			System.out
					.println("IOException while accessing file containing registered users!");
			throw new AttractionsException(
					"IOException while accessing file containing registered users!");
		} catch (ClassNotFoundException cnfe) { System.out.println("ClassNotFoundException while"
				+ " reading file containing registered users!");
			throw new AttractionsException(
					"ClassNotFoundException while reading file containing validated attractions!");
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

	@Override
	public boolean validateAttractions(Attractions attractions) throws AttractionsException {
		// TODO Auto-generated method stub
		return false;
	}
	

}
