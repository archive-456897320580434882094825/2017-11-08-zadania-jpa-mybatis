package com.sodexo.szkolenie.service;

import com.sodexo.szkolenie.model.Customer;
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
            em.persist(customer1);
            transaction.commit();
        } catch (PersistenceException e) {
            transaction.rollback();
        } finally {
            em.close();
        }
    }

}
