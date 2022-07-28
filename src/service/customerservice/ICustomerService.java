package service.customerservice;

import domain.Customer;
import service.IService;
import service.exceptions.*;

public interface ICustomerService extends IService{
	

	public final String NAME = "ICustomerService";
	
	/** 
	 * Validate that customer has been registered into our application 
	 * @param Customer - contains customer information to be validated 
	 * @throws CustomerException 
	 * 							If the Customer object is null or
	 *   				        If the file that contains the customer information is not found or
	 *   					    If an unexpected exception is encountered while accessing the customer file.
	 * @return boolean
	 * 					true - if validated
	 * 				    false - if failed to validate
	 * */
	

public boolean validateCustomer (Customer customer) throws CustomerException; 

}
