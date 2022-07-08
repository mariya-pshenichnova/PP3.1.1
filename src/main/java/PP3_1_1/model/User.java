package PP3_1_1.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Не заполнено имя ")
    @Size(min = 2, max = 30, message = "Имя должно иметь длину от 2 до 30 символов")
    @Column(name = "name")
    private String name;

    @Min(value = 0, message = "Нельзя вводить отрицательный возраст")
    @Column(name = "age")
    private int age;

    @NotEmpty(message = "Не заполнен e-email")
    @Email(message = "Не корректный e-mail")
    @Column(name = "email")
    private String email;

    public User() {
    }

    public User(int id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
