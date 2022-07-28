package service.reviewsservice;


import domain.Reviews;
import service.exceptions.ReviewsException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class ReviewsServiceImpl implements IReviewsService {
	

	@SuppressWarnings("unlikely-arg-type")
	public boolean validateReviews(Reviews Reviews) 
			throws ReviewsException {
		
		boolean isValid = false;
		ObjectInputStream input = null;
		try {
		
			input = new ObjectInputStream(new FileInputStream(
					"ValidatedReviews.out"));
			Reviews validatedReviews = (Reviews) input.readObject();

			String inReviews = new String();
			if (validatedReviews.equals(inReviews))
				isValid = true;
			else
				isValid = false;
		} catch (FileNotFoundException fnfe) {
			System.out.println("File containing validated Reviews not found!");
			throw new ReviewsException( "File containing validated Reviews not found!" );
		} catch (IOException ioe) {
			System.out
					.println("IOException while accessing file containing registered users!");
			throw new ReviewsException(
					"IOException while accessing file containing registered users!");
		} catch (ClassNotFoundException cnfe) { System.out.println("ClassNotFoundException while"
				+ " reading file containing registered users!");
			throw new ReviewsException(
					"ClassNotFoundException while reading file containing validated Reviews!");
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
