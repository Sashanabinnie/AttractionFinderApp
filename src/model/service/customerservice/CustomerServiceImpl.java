package model.service.customerservice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import model.domain.Customer;
import model.service.exception.CustomerException;


public abstract class CustomerServiceImpl implements ICustomerService {
	

	@SuppressWarnings("unlikely-arg-type")
	public boolean validateCustomer(Customer Customer) 
			throws CustomerException {
		
		boolean isValid = false;
		ObjectInputStream input = null;
		try {
		
			input = new ObjectInputStream(new FileInputStream(
					"ValidatedCustomer.out"));
			Customer validatedCustomer = (Customer) input.readObject();

			String inCustomer = new String();
			if (validatedCustomer.equals(inCustomer))
				isValid = true;
			else
				isValid = false;
		} catch (FileNotFoundException fnfe) {
			System.out.println("File containing validated Customer not found!");
			throw new CustomerException( "File containing validated Customer not found!" );
		} catch (IOException ioe) {
			System.out
					.println("IOException while accessing file containing registered users!");
			throw new CustomerException(
					"IOException while accessing file containing registered users!");
		} catch (ClassNotFoundException cnfe) { System.out.println("ClassNotFoundException while"
				+ " reading file containing registered users!");
			throw new CustomerException(
					"ClassNotFoundException while reading file containing validated Customer!");
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

