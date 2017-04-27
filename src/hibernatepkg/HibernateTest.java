package hibernatepkg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import models.UserDetails;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDetails user = new UserDetails();
//		user.setUserId(3);
//		user.setUsername("hahha");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		
		user = null;
		
		session = sf.openSession();
		session.beginTransaction();
		user = (UserDetails) session.get(UserDetails.class, 2);
		System.out.println(user.getUsername());
		session.getTransaction().commit();
		
		session.close();
	}

}
