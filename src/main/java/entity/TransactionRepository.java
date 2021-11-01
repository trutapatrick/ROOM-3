package entity;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class TransactionRepository {
    public void createTransaction(entity.Transaction transactions) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(transactions);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteTransaction(entity.Transaction transactions){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(transactions);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public entity.Transaction getTransations(int  transactionId){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            entity.Transaction transaction = session.find(entity.Transaction.class, transactionId);
            return transaction;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public List<entity.Transaction> getTransactions() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("select t from Transaction t", entity.Transaction.class);
            List<entity.Transaction> trasnsactions = query.list();
            return trasnsactions;
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

}
