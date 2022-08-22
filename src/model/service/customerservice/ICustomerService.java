package model.service.customerservice;

import model.domain.Customer;
import model.service.IService;
import model.service.exception.CustomerException;


public interface ICustomerService extends IService {
	

	public final String NAME = "ICustomerService";
	
	

public boolean validateCustomer (Customer customer) throws CustomerException; 

}
