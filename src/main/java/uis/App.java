package uis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import common.AppConfig;
import daos.BelongingDao;
import daos.PersonDao;
import entities.Belonging;
import entities.Person;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Model.xml");

		Person person = (Person) context.getBean("person");

		Belonging belonging1 = (Belonging) context.getBean("belonging");
		belonging1.setPerson(person);
		Belonging belonging2 = (Belonging) context.getBean("belonging");
		belonging2.setId(2);
		belonging2.setPerson(person);

		List<Belonging> list = new ArrayList<Belonging>();
		list.add(belonging1);
		list.add(belonging2);

		person.setBelongings(list);

		PersonDao personDao = (PersonDao) context.getBean("personDao");
//		personDao.save(person);
		BelongingDao belongingDao = (BelongingDao) context.getBean("belongingDao");
//		list.forEach(e -> belongingDao.save(e));
		personDao.delete(person);
	}
}
