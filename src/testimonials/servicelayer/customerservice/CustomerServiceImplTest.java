package testimonials.servicelayer.customerservice;

import junit.framework.TestCase;
import testimonials.domainlayer.*;
import testimonials.servicelayer.factory.*;

public class CustomerServiceImplTest extends TestCase {

	private ServiceFactory ServiceFactory;
	private Customer customer;

	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		ServiceFactory = new ServiceFactory();

		customer = new Customer("001", "Sashana", "Binnie", "Sashanab",
				"2022-07-18", "06.30");

	}
		public final void testCustomer() {

			ICustomerService customerService = ServiceFactory.getCustomerService();
			assertTrue(customerService.authenticateCustomer(customer));
			System.out.println("testAuthenticateCustomer PASSED");

			CustomerServiceImpl customerServiceImpl = (CustomerServiceImpl) ServiceFactory
					.getCustomerService();
			assertTrue(CustomerServiceImpl.authenticateCustomer(customer));
			System.out.println("testAuthenticateCustomer PASSED");
		
	}
	
}