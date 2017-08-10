package com.bellinfo.hibernate.assosciations.manytomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class ManytoManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		car.setCarName("Honda");
		
		Car car2 = new Car();
		car2.setCarName("Benz");
		
		Car car3 = new Car();
		car3.setCarName("Bentley");
		
		Drivers driver1 = new Drivers();
		driver1.setName("Krishna");
		
		Drivers driver2 = new Drivers();
		driver2.setName("Kanth");
		
		Drivers driver3 = new Drivers();
		driver3.setName("shiva");
		
		car.getDrivers().add(driver1);
		car.getDrivers().add(driver2);
		
		car2.getDrivers().add(driver3);
		
		car3.getDrivers().add(driver3);
		car3.getDrivers().add(driver2);
		car3.getDrivers().add(driver1);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry); 
		
		/*@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();*/
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(car);
		session.save(car2);
		session.save(car3);
		
		session.close();
	
		
		
	}

}
