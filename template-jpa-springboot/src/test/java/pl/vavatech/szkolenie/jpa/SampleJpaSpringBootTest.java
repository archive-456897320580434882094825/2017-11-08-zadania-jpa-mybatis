package pl.vavatech.szkolenie.jpa;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import pl.vavatech.szkolenie.jpa.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@RunWith(SpringRunner.class)
@SpringBootTest
@org.springframework.test.annotation.Rollback(false)
@javax.transaction.Transactional
@ActiveProfiles("h2")
//@ActiveProfiles("postgres")
public class SampleJpaSpringBootTest {

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	EntityManager em;

	@Test
	public void test() {
		Person u1 = new Person();
		u1.setFirstName("Jan");
		u1.setLastName("Kowalski");
		em.persist(u1);
	}

}
