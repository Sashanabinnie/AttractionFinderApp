package testimonials.servicelayer.customerservice;

import testimonials.domainlayer.Customer;

public class CustomerServiceImpl implements ICustomerService {


	public boolean authenticateCustomer(Customer customer) {
		
		System.out.println ("Validating method LoginServiceImpl::authenticateCustomer");
		
		return true;
	}	
}
