package demo;

public class Patient {
    private int id;
    private String name;
    private Double hospitalFee;

//    public Patient(int id, String name, Double hospitalFee) {
//    }


    public Patient(int id, String name, Double hospitalFee) {

        this.id = id;
        this.name = name;
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toString() {
        return "Patient{" + "ID=" + id + ", name=" + name + ", HospitalFee=" + hospitalFee + '}';
    }
}
