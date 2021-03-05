import java.util.HashMap;
import java.util.HashSet;

public class Table {
    HashMap<Student, Student> teibl;
    

    public Table() {
        teibl = new HashMap<>(1);
    }

    public void addStudentToSit(Student student) {
        if (validTableType(student) == student.getGender()) {
            
        }
    }

    public int getSeatsTaken() {
        return teibl.size();
    }

    public Gender validTableType(Student student) {
        int boy = 0;
        int girl = 0;
        for (Student s : teibl.keySet()) {
            if (s.getGender().equals(Gender.BOY)) {
                boy++;
            } else {
                girl++;
            }
        }
        if (boy > 0 && girl == 0) {
            return Gender.BOY;
        } else if ( girl > 0 && boy == 0) {
            return Gender.GIRL;
        } else {
            return student.getGender();
        }
    }

    public void printStudents() {
        for (Student s : teibl.keySet()) {
            System.out.println(s);
            System.out.println(teibl.get(s));
        }
    }

    public HashMap<Student, Student> getTeibl() {
        return teibl;
    }
}
