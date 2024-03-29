import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class).buildSessionFactory();
        Session session = factory.getCurrentSession();
        try {
            session.beginTransaction();
            //SELECT * FROM city

            List<City> cities = session.createQuery("from City",City.class).getResultList();
            for (City city:cities) {
                System.out.println(city.getName());
            }
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}
