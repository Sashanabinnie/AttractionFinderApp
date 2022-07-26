package service.exceptions;



public class AttractionsException extends Exception {

private static final long serialVersionUID = 47798218545458428L;

	
	/* public AttractionsException (final String inMessage)
    {
        super(inMessage);
    }
	
	
	public AttractionsException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    } */

public AttractionsException (String s)  {
		super ();
			s = "Invalid Attractions ID Number" ;
	
		}
	}

