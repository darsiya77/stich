package PP.Relationships.one_to_one.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "students")  // �����������: ���� ��� ������� ���������� �� ����� ������
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // ������������� � MySQL
    private Long id;

    @Column(name = "name")  // ���� NOT NULL � ��
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "avg_grade")  // ���� ��� ������� � �� ���������� (snake_case)
    private Double avgGrade;

    @OneToOne
    @JoinColumn(name = "passport_id")
    private Passport passport;

    // ������������
    public Student() {
        // ������������ ������ ����������� ��� Hibernate
    }

    public Student(String name, String surname, Double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
    }

    // ������� � �������
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(Double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }

    // toString() ��� �������� �������
    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", avgGrade = " + avgGrade +
                '}';
    }
}
