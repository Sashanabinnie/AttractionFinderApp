package testimonials.service.attractions;

import junit.framework.TestCase;
import model.domain.Attractions;
import model.service.attractionsservice.AttractionsServiceImpl;
import model.service.attractionsservice.IAttractionsService;
import model.service.customerservice.ICustomerService;
import model.service.exception.AttractionsException;
import model.service.exception.ServiceLoadException;
import model.service.factory.ServiceFactory;


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
			.getService(IAttractionsService.NAME);
			assertTrue(attractionsService.validateAttractions(attractions));
			System.out.println("Test ValidateAttractions PASSED");
			
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