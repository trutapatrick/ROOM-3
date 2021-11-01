package entity.user;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import util.HibernateUtil;

import java.util.List;

public class UserRepository {

    public void createUser(User user) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.save(user);
            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void updateUser(User user) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.update(user);
            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteUser(User user) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            transaction = session.beginTransaction();
            session.delete(user);
            transaction.commit();

        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public User getUser(int id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            User user = session.find(User.class, id);
            return user;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public List<User> getUsers() {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query query = session.createQuery("select u from users u", User.class);
            List<User> users = query.list();
            return users;

        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
