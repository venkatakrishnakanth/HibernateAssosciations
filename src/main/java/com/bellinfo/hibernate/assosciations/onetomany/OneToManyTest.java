package com.bellinfo.hibernate.assosciations.onetomany;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class OneToManyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parents p1 = new Parents();
		p1.setFatherName("Bahubali");
		p1.setMotherName("Deva Sena");
		
		Child c1 = new Child();
		c1.setName("Shivudu");
		
		Child c2 = new Child();
		c2.setName("Amarendra Bahubali");
		
		p1.getChildren().add(c1);
		p1.getChildren().add(c2);
		
		Configuration configuration = new Configuration();
		configuration.configure();
		ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();        
		SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry); 
		
		/*@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();*/
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(p1);
		
		session.getTransaction().commit();
		
		session.close();
	}

}
