package hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import hibernate.demo.entity.Patient;

import java.util.List;

public class PatientDAO {

    private final SessionFactory factory;

    public PatientDAO() {
        this.factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Patient.class)
                .buildSessionFactory();
    }

    public void insertPatient(Patient patient) {
        Transaction transaction = null;
        try (Session session = factory.getCurrentSession()) {
            transaction = session.beginTransaction();
            session.save(patient);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }

    public Patient getPatient(int id) {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            Patient myPatient = session.get(Patient.class, id);
            session.getTransaction().commit();
            return myPatient;
        }
    }

    public List<Patient> getAllPatients() {
        try (Session session = factory.getCurrentSession()) {
            session.beginTransaction();
            List<Patient> patients = session.createQuery("from Patient", Patient.class).getResultList();
            session.getTransaction().commit();
            return patients;
        }
    }
}
