package testimonials.service.customer;

import junit.framework.TestCase;
import model.domain.Customer;
import model.service.customerservice.CustomerServiceImpl;
import model.service.customerservice.ICustomerService;
import model.service.exception.CustomerException;
import model.service.exception.ServiceLoadException;
import model.service.factory.ServiceFactory;



public class CustomerServiceImplTest extends TestCase {


	private ServiceFactory serviceFactory;
	private Customer customer;


	protected void setUp() throws Exception {
		
		super.setUp();

		serviceFactory = ServiceFactory.getInstance();

		customer = new Customer( 51615611l, "Sashana", "Binnie", "Sashanaab",
				"July-22-2022", "07:30");

	}


	public final void testValidateCustomer() {
		ICustomerService customerService;
		
		try { customerService = (ICustomerService) serviceFactory
			.getService(ICustomerService.NAME);
			assertTrue(customerService.validateCustomer(customer));
			System.out.println("Test ValidateCustomer PASSED");
			
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
			
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("CustomerException");

		}

		try { CustomerServiceImpl customerServiceImpl = (CustomerServiceImpl) serviceFactory
			.getService(ICustomerService.NAME);
			assertTrue(customerServiceImpl.validateCustomer(customer));
			System.out.println("Test ValidateCustomer PASSED");
			
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
			
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("CustomerException");

		}
	}

}