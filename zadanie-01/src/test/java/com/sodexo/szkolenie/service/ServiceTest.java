package com.sodexo.szkolenie.service;

import com.sodexo.szkolenie.model.Customer;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import javax.persistence.*;

/**
 * Created by Michał Kordulewski on 09.11.17.
 */
public class ServiceTest {

    @Test
    public void testUtrwalania() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("postgres");
        EntityManager em = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        try {
            Customer customer1 = new Customer();
            customer1.setFirstName("Jan");
            customer1.setLastName("Nowak");
            Assertions.assertThat(customer1.getId()).isNull();
            em.persist(customer1);
            Assertions.assertThat(customer1.getId()).isNotNull();
            Assertions.assertThat(em.find(Customer.class, (long)customer1.getId())).isNotNull();
            Customer customer2 = new Customer();
            customer2.setFirstName("Krzysztof");
            customer2.setLastName("Kowalski");
            em.persist(customer2);
            Assertions.assertThat(em.find(Customer.class, (long)customer2.getId())).isNotNull();
            Customer customer3 = new Customer();
            customer3.setFirstName("Marian");
            customer3.setLastName("Janik");
            em.persist(customer3);
            Assertions.assertThat(em.find(Customer.class, (long)customer3.getId())).isNotNull();
            em.flush();
            transaction.commit();
        } catch (PersistenceException e) {
            transaction.rollback();
        } finally {
            em.close();
        }
    }

}
