package hibernate.demo.entity;


        import javax.persistence.Column;
        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.GenerationType;
        import javax.persistence.Id;
        import javax.persistence.Table;





    @Entity
@Table(name = "pratienttbl")
public class  Patient {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="hospitalFee")
    private Double hospitalFee;


    public Patient() {

    }

    public Patient(int id, String name, Double hospitalFee) {
        this.id = id;
        this.name = name;
        this.hospitalFee = hospitalFee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHospitalFee() {
        return hospitalFee;
    }

    public void setHospitalFee(Double hospitalFee) {
        this.hospitalFee = hospitalFee;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hospitalFee='" + hospitalFee + '\'' +
                '}';
    }

}

