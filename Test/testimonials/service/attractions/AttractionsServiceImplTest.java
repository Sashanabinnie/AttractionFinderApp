package testimonials.service.attractions;

import domain.Attractions;
import junit.framework.TestCase;
import service.attractionsservice.AttractionsServiceImpl;
import service.attractionsservice.IAttractionsService;
import service.customerservice.ICustomerService;
import service.exceptions.*;
import service.factory.ServiceFactory;

public class AttractionsServiceImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private Attractions attractions;

	
	protected void setUp() throws Exception {
		super.setUp();

		serviceFactory = ServiceFactory.getInstance();

		attractions = new Attractions (661515151l, "Talcott Mountain", "Hiking Trail", "Sashana Binnie",
				"22", "Month", "2022", "07:30");

		
	}

	public final void testValidateAttrcations() {

		IAttractionsService attractionsService;
		try {
			attractionsService = (IAttractionsService) serviceFactory
					.getService(ICustomerService.NAME);
			assertTrue(attractionsService.validateAttractions(attractions));
			System.out.println("testValidateCustomer PASSED");
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (AttractionsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("CustomerException");

		}

		try {
			AttractionsServiceImpl AttractionsServiceImpl = (AttractionsServiceImpl) serviceFactory
					.getService(ICustomerService.NAME);
			assertTrue(AttractionsServiceImpl.validateAttractions(attractions));
			System.out.println("ValidateAttractions PASSED");
		} catch (ServiceLoadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("ServiceLoadException");
		} catch (AttractionsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			fail("AttractionsException");


		}
	}

}