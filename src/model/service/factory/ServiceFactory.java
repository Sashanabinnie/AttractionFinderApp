package model.service.factory;

import model.service.IService;
import model.service.exception.ServiceLoadException;
import model.service.manager.PropertyManager;


public class ServiceFactory {

	private ServiceFactory() {}
	private static ServiceFactory serviceFactoryInstance;
	public static ServiceFactory getInstance() 
	{
		if (serviceFactoryInstance == null)
			serviceFactoryInstance = new ServiceFactory();		
		return serviceFactoryInstance;
	}


	@SuppressWarnings("deprecation")
	public IService getService(String serviceName) throws ServiceLoadException
	{
		try 
		{
		   Class<?> c = Class.forName(getImplName(serviceName));
		   return (IService)c.newInstance();
		} catch (Exception excp) 
		{
		   serviceName = serviceName + " not loaded";
		   throw new ServiceLoadException(serviceName, excp);
		}
	}
	
	private String getImplName (String serviceName) 
	{
		return PropertyManager.getPropertyValue(serviceName);
	}
	
} 