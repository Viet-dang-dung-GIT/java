package hibernate.demo;

import hibernate.demo.entity.Patient;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        PatientDAO patientDAO = new PatientDAO();

        // Thêm bệnh nhân
        Patient newPatient = new Patient(0,"tha thu", 150.00);
        patientDAO.insertPatient(newPatient);

        // Đọc thông tin bệnh nhân dựa trên ID
//        Patient retrievedPatient = patientDAO.getPatient(newPatient.getId());
//        System.out.println("Retrieved Patient: " + retrievedPatient);

        // Đọc tất cả bệnh nhân
        List<Patient> allPatients = patientDAO.getAllPatients();
        System.out.println("All Patients:");
        for (Patient patient : allPatients) {
            System.out.println(patient);
        }
    }
}
