package model.service.exception;

@SuppressWarnings("serial")
public class ServiceLoadException extends Throwable
{
    public ServiceLoadException(final String inMessage, final Throwable inNestedException)
    {
        super(inMessage, inNestedException);
    }
	
} 