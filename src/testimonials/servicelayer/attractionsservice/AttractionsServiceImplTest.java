package testimonials.servicelayer.attractionsservice;

import junit.framework.TestCase;
import testimonials.domainlayer.*;
import testimonials.servicelayer.factory.*;

public class AttractionsServiceImplTest extends TestCase {

	private ServiceFactory ServiceFactory;
	private Attractions attractions;

	
	@Override
	protected void setUp() throws Exception {
		super.setUp();

		ServiceFactory = new ServiceFactory();

		attractions = new Attractions("ATT01", "Talcott Mountain", "Hiking Trail, Nature", "SashanaBinnie",
				"2022-07-18", "06.30");

	}
		public final void testAttractions() {

			IAttractionsService attractionsService = ServiceFactory.getAttractionsService();
			assertTrue(attractionsService.authenticateAttractions(attractions));
			System.out.println("testAuthenticateCustomer PASSED");

			AttractionsServiceImpl attractionsServiceImpl = (AttractionsServiceImpl) ServiceFactory
					.getAttractionsService();
			assertTrue(AttractionsServiceImpl.authenticateAttractions(attractions));
			System.out.println("testAuthenticateCustomer PASSED");
		
	}
	
}
