import java.util.Objects;

public class Human {
    private String firstname;
    private String name;
    private String lastname;
    private int age;
    private Sex sex;

    public Human(String firstname, String name, String lastname, int age, Sex sex) {
        this.lastname = lastname;
        this.firstname = firstname;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && Objects.equals(firstname, human.firstname) && Objects.equals(name, human.name) && Objects.equals(lastname, human.lastname) && sex == human.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstname, name, lastname, age, sex);
    }
}
