package Students;
import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", "Doe", 1, true));
        students.add(new Student("Giorgi", "Ravi", 2, false));
        students.add(new Student("Saxeli", "Gvari", 3, true));

    for (int i = 0; i < students.size(); i++) {
        Student s = students.get(i);
            if (s.isActive()) {
                System.out.println(s.getName() + " " + s.getSurname() + "; ID: " + s.getId() + "; Activity: \033[42m" + s.isActive() + "\033[0m");
            } else {
                System.out.println("\033[41m" + s.getName() + " " + s.getSurname() + "; ID: " + s.getId() + "; Activity: " + s.isActive() + "\033[0m");
            }
        }
    }
}
