package com.example.demojpapostgres;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

@RunWith(SpringRunner.class)
@SpringBootTest
@org.springframework.test.annotation.Rollback(false)
@javax.transaction.Transactional
@ActiveProfiles("h2")
//@ActiveProfiles("postgres")
public class JpaSpringBootTests {

	@Test
	public void contextLoads() {
	}

	@PersistenceContext(type = PersistenceContextType.EXTENDED)
	EntityManager em;

	@Test
	@javax.transaction.Transactional
	public void testPostgres() {
		// prepare
		Person u1 = new Person();
		u1.setFirstName("Jan");
		u1.setLastName("Kowalski");
		em.persist(u1);
	}

}
