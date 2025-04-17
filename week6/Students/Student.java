package Students;
public class Student {
    private String name;
    private String surname;
    private int id;
    private boolean active;

    public Student(String name, String surname, int id, boolean active) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.active = active;
    }
    public String getName() {
    return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getId() {
        return id;
    }

    public boolean isActive() {
        return active;
    }


}
