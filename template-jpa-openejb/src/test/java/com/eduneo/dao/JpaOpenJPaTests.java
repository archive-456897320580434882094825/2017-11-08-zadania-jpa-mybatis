package com.eduneo.dao;

import com.eduneo.model.Lang;
import org.apache.openejb.junit.jee.EJBContainerRunner;
import org.apache.openejb.junit.jee.config.PropertyFile;
import org.apache.openejb.junit.jee.transaction.Transaction;
import org.assertj.core.api.StrictAssertions;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@RunWith(EJBContainerRunner.class)
@PropertyFile(value = "openejb-h2.properties")
//@PropertyFile(value = "openejb-postgres.properties")
public class JpaOpenJPaTests {

    @PersistenceContext
    private EntityManager em;

    @Test
    @Transaction(rollback = false)
    public void test() {
        Lang entity1 = Lang.builder().code("JP").name("Japanese").build();
        StrictAssertions.assertThat(entity1.getId()).isNull();
        em.persist(entity1);
        StrictAssertions.assertThat(entity1.getId()).isNotNull();
        StrictAssertions.assertThat(em.find(Lang.class, entity1.getId())).isNotNull();

        Lang entity2 = Lang.builder().code("ES").name("Spanish").build();
        StrictAssertions.assertThat(entity2.getId()).isNull();
        em.persist(entity2);
        StrictAssertions.assertThat(entity2.getId()).isNotNull();
        StrictAssertions.assertThat(em.find(Lang.class, entity2.getId())).isNotNull();

        Lang entity3 = Lang.builder().code("IT").name("Italian").build();
        StrictAssertions.assertThat(entity3.getId()).isNull();
        em.persist(entity3);
        StrictAssertions.assertThat(entity3.getId()).isNotNull();
        StrictAssertions.assertThat(em.find(Lang.class, entity3.getId())).isNotNull();

    }

}
