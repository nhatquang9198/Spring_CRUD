package daos;

import java.util.List;

import org.hibernate.Session;

import common.HibernateUtil;

public abstract class GeneralCRUD<T> {

	public void create(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.save(t);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

	public List<T> readAll() {
		return null;
	}

	public void update(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.update(t);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}

	public void delete(T t) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		session.delete(t);
		session.getTransaction().commit();
		HibernateUtil.shutdown();
	}
}
