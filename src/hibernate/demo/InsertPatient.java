package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Patient;

public class InsertPatient{

    public static void main(String[] args) {
        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Patient.class)
                .buildSessionFactory();

        // Create session
        Session session = factory.getCurrentSession();

        try {
            // create a patient object
            Patient newPatient = new Patient(6,"gjj", 1500.0);

            // start a transaction
            session.beginTransaction();

            // save the patient object
            System.out.println("Saving the patient...");
            session.save(newPatient);

            // commit transaction
            session.getTransaction().commit();

            System.out.println("Saved patient. Generated id: " + newPatient.getId());
        } finally {
            factory.close();
        }
    }
}
