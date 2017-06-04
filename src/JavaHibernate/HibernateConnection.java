package JavaHibernate;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class HibernateConnection {
	
	
	public static void main(String[] args){
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ses=sf.openSession();
		
		Transaction t=ses.beginTransaction();
		
		
		User usr=new User();
		
		usr.setId(12);
		usr.setFirstName("Vikram");
		usr.setSecondName("Rakesh");
		
		ses.persist(usr);
		
		t.commit();
		
		
		ses.close();
		 
		System.out.println("Successfully saved");
	}

}
