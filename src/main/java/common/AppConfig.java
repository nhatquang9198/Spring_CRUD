package common;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import daos.BelongingDao;
import daos.PersonDao;
import entities.Belonging;
import entities.Person;

@Configuration
@Import({ Person.class, Belonging.class, PersonDao.class, BelongingDao.class })
public class AppConfig {
	
}
