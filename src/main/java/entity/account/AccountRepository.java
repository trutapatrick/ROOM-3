package entity.account;

import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;
import org.hibernate.query.Query;
import util.HibernateUtil;

public class AccountRepository {

    public void createAccount(Account account) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(account);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteAccount(Account account){
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(account);
            transaction.commit();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Account findAcount(String iban){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Account account = session.find(Account.class, iban);
            return account;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }

    public String findIbanByCodCl(int codClient){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Account account = session.find(Account.class, codClient);
            return account.getIban();
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }

    }
    public List<Account> getAccounts() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("select a from Account a", Account.class);
            List<Account> accounts = query.list();
            return accounts;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}