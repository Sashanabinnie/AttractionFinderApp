package testimonials.domain;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class ServiceFactoryTest extends TestCase {

	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = ServiceFactory.getInstance();		
	}
	
	@Test
	public void testGetCustomerService() {
 		ICustomerService customerService;
		try {
			customerService = (ICustomerService)serviceFactory.getService(ICustomerService.NAME);
	  	    assertTrue(customerService instanceof CustomerServiceImpl);
	        System.out.println("testGetLoginService PASSED");	  	    
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
	
}
