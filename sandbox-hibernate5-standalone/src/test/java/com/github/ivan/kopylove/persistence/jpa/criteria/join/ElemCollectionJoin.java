package com.github.ivan.kopylove.persistence.jpa.criteria.join;

import com.github.ivan.kopylove.sandbox.persistence.jpa.join.Ticket;
import com.github.ivan.kopylove.sandbox.persistence.util.JpaEntityManagerFactory;
import org.junit.jupiter.api.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;
import java.util.List;

class ElemCollectionJoin
{
    @Test
    void run()
    {
        EntityManager entityManager = JpaEntityManagerFactory.getEntityManger();

        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Ticket> cr = cb.createQuery(Ticket.class);
        Root<Ticket> root = cr.from(Ticket.class);
        cr.select(root);

        Join<Object, Object> objectObjectObjectMapJoin = root.join("ticketDetails")
                                                             .join("genericProperties")
                                                             .join("properties");

        TypedQuery<Ticket> query = entityManager.createQuery(cr);
        List<Ticket> parents = query.getResultList();

        if (parents.size() > 0)
        {
            parents.get(0)
                   .getTicketDetails()
                   .getGenericProperties()
                   .getProperties();
        }
    }
}
