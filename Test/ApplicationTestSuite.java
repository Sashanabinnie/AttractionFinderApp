
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import testimonials.business.AllBusinessTest;
import testimonials.domain.*;
import testimonials.service.*;



@RunWith(Suite.class)
@SuiteClasses({ AllBusinessTest.class, AllServicesTest.class, AllDomainTest.class})
public class ApplicationTestSuite {

}




