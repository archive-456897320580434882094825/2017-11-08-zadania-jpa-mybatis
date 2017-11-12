package com.example.demojpapostgres;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaJseTests {

	private EntityManager em() {
		return em("h2");
	}

	private EntityManager em(String persistenceUnit) {
		EntityManagerFactory entityManagerFactory =  Persistence.createEntityManagerFactory(persistenceUnit);
		EntityManager em = entityManagerFactory.createEntityManager();
		return em;
	}

	@Test
	public void test() {
		EntityManager em = em();
		em.getTransaction().begin();
		try {
			SampleEntity e1 = SampleEntity.builder().name("entity 1").build();
			Assertions.assertThat(em.find(SampleEntity.class, e1.getId())).isNull();
			em.persist(e1);
			Assertions.assertThat(em.find(SampleEntity.class, e1.getId())).isNotNull();

			SampleEntity e2 = SampleEntity.builder().name("entity 1").build();
			Assertions.assertThat(em.find(SampleEntity.class, e2.getId())).isNull();
			em.persist(e2);
			Assertions.assertThat(em.find(SampleEntity.class, e2.getId())).isNotNull();

			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		} finally {
			em.close();
		}
	}

}
