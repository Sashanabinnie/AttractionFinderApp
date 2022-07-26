package service.customerservice;

import domain.Customer;

public class CustomerServiceImpl implements ICustomerService {


	public boolean authenticateCustomer(Customer customer) {
		
		System.out.println ("Validating method CustomerServiceImpl::authenticateCustomer");
		
		return true;
	}	
}
