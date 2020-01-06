package daos;

import java.util.List;

import org.hibernate.Session;

import common.HibernateUtil;
import entities.Belonging;

public class BelongingDao extends GeneralCRUD<Belonging> {
	
	public void createMany(List<Belonging> list) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		list.forEach(b -> session.save(b));
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
