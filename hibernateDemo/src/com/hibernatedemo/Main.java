package com.hibernatedemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		
		try {
			
			//unit of work
			session.beginTransaction();
			
			//HQL ---> HÝBERNATE QUERY LANGUAGE
			//select * from city
			//"from City c where c.countryCode='TUR' and c.district='Ankara' "
			//ASC - Ascending(yükselen)
			//DESC - Descending(alcalan)
			//ORDER BY sýralama
			//GROUP BY gruplama
			
			/*
			 * List<String> countryCodes =
			 * session.createQuery("select c.countryCode from City c GROUP BY c.countryCode"
			 * ).getResultList();
			 * 
			 * 
			 * for(String countryCode:countryCodes) { System.out.println(countryCode); }
			 */
			
			
			//ÝNSERT
//			City city = new City();
//			city.setName("Tokat001");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(10000);
//			session.save(city);
			
			
			//UPDATE
			
//			City city = session.get(City.class, 4080);			
//			city.setPopulation(135000);
//			city.setName("tokat01");	
			
			//DELETE
			City city = session.get(City.class, 3017);
			System.out.println(city.getName());
			session.delete(city);
			
			session.getTransaction().commit();
			System.out.println("Baþarýlý");			
			
		}finally {
			factory.close();
		}

	}

}
