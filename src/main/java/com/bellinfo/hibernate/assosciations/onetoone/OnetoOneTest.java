package com.bellinfo.hibernate.assosciations.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class OnetoOneTest {

	public static void main(String[] args) {
		
		CellPhone c1 = new CellPhone();
		c1.setCompany("Apple");
		c1.setModel("6S");
		
		
		CellPhone c2 = new CellPhone();
		c2.setCompany("Samsung");
		c2.setModel("S8");
		
		
		Owner o1 = new Owner();
		o1.setAge("24");
		o1.setName("Krishna Kanth");
		
		
		Owner o2 = new Owner();
		o2.setAge("30");
		o2.setName("Suresh");
		
		c1.setOwner(o1);
		c2.setOwner(o2);
		
		
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry); 
		
		/*@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();*/
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(c1);
		session.save(c2);
		
		session.getTransaction().commit();
		
		session.close();

	}

}
