package entity.client;

import org.hibernate.Session;
import util.HibernateUtil;

public class ClientRepository {
    public Client findClient(int codClient){
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Client client = session.find(Client.class, codClient);
            return client;
        } catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
    }
}
