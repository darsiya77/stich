package PP.Relationships.one_to_one.entity;

import javax.persistence.*;

@Entity
@Table
public class Passport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Автоинкремент в MySQL
    @Column (name = "id")
    private Long id;

    @Column (name = "email")
    private String email;

    @Column (name = "height")
    private int height;

    @Column (name = "eye_color")
    private String eyeColor;

    public Passport(String email, int height, String eyeColor) {
        this.email = email;
        this.height = height;
        this.eyeColor = eyeColor;
    }
    public Passport() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id = " + id +
                ", emale = '" + email + '\'' +
                ", heght = '" + height + '\'' +
                ", eyeColor = '" + eyeColor + '\'' +
                '}';
    }
}
