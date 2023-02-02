package ua.osadchuk;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.osadchuk.model.Principal;
import ua.osadchuk.model.School;

public class App {
    public static void main(String[] args) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Principal.class).addAnnotatedClass(School.class);

        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        try {
            session.beginTransaction();

//            Отримання деректора, та його школи:
//            Principal principal = session.get(Principal.class,1);
//            System.out.println(principal.getSchool());

//            Створення нового директора, та нову школу:
//            Principal principal = new Principal("Taras", 21);
//            School school = new School(123, principal);
//            principal.setSchool(school);
//            session.save(principal);

//            Заміна директора у старій школі:
//            Principal principal = new Principal("Andrii", 27);
//            School school = session.get(School.class, 5);
//            school.setPrincipal(principal);
//            session.save(principal);


            session.getTransaction().commit();

        } finally {
            sessionFactory.close();
        }


    }
}