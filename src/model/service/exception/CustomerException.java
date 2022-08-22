package model.service.exception;

public class CustomerException extends Exception {
	
private static final long serialVersionUID = 47798218545458428L;

	
	/* public CustomerException (final String inMessage)
    {
        super(inMessage);
    }
	
	
	public CustomerException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    } */

public CustomerException (String s)  {
		
			s = "Invalid Customer" ;
	
		}

	
}
