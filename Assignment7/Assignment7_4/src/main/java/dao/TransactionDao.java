package dao;

import datasource.MariaDbJpaConnection;
import jakarta.persistence.EntityManager;
import model.Transaction;

public class TransactionDao {

    public void persist(Transaction transaction) {

        EntityManager em = MariaDbJpaConnection.getInstance();

        try {
            em.getTransaction().begin();
            em.persist(transaction);
            em.getTransaction().commit();
        } catch (Exception e) {

            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }

            e.printStackTrace();
        }
    }

}