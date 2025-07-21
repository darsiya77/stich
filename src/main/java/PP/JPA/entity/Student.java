package PP.JPA.entity;

import javax.persistence.*;
import java.time.LocalDate;

//@Entity
//@Table(name = "students")  // Опционально: если имя таблицы отличается от имени класса
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Автоинкремент в MySQL
    private Long id;

    @Column(name = "name", nullable = false, unique = true)  // Поле NOT NULL в БД
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "avg_grade")  // Если имя столбца в БД отличается (snake_case)
    private Double avgGrade;

    @Transient
    private LocalDate createdDate;

    // Конструкторы
    public Student() {
        // Обязательный пустой конструктор для Hibernate
    }

    public Student(String name, String surname, Double avgGrade) {
        this.name = name;
        this.surname = surname;
        this.avgGrade = avgGrade;
        this.createdDate =  LocalDate.now();
    }

    // Геттеры и сеттеры
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

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    // toString() для удобства отладки

    @Override
    public String toString() {
        return "Student{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", avgGrade = " + avgGrade +
                ", createdDate = " + createdDate +
                '}';
    }
}
