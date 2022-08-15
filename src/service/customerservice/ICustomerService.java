package service.customerservice;

import domain.Customer;
import service.IService;
import service.exceptions.*;

public interface ICustomerService extends IService {
	

	public final String NAME = "ICustomerService";
	
	

public boolean validateCustomer (Customer customer) throws CustomerException; 

}
