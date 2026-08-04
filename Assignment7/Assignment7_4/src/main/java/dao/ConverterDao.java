package dao;

import datasource.MariaDbJpaConnection;
import jakarta.persistence.EntityManager;
import model.Converter;

import java.util.List;


public class ConverterDao {

    public void persist(Converter con) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(con);
        em.getTransaction().commit();
    }

    public List<Converter> getAllCurrencies() {
        EntityManager em = MariaDbJpaConnection.getInstance();
        List<Converter> Converter = em.createQuery("select c from Currency c", Converter.class).getResultList();
        return Converter;
    }

    public double getExchangedRate(String Curcode) {
        EntityManager em = MariaDbJpaConnection.getInstance();

        try {
            Converter currency =
                    em.createQuery("SELECT c FROM Converter c WHERE c.converted_to = :code", Converter.class).setParameter("code", Curcode).getSingleResult();

            return currency.getexchanged_rate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }

    public Converter find(int id) {
        EntityManager em = MariaDbJpaConnection.getInstance();
        Converter curren = em.find(Converter.class, id);
        return curren;
    }

}


