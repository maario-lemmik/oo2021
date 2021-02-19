import java.util.HashSet;

public class Table {
    HashSet<Student> teibl;
    int chairs;

    public Table(int chairs) {
        teibl = new HashSet<>();
        this.chairs = chairs;
    }

    public void addStudentToSit(Student student) {
        if (validTableType(student) == student.getGender()) {
            teibl.add(student);
        }
    }

    public int getSeatsTaken() {
        return teibl.size();
    }

    public Gender validTableType(Student student) {
        int boy = 0;
        int girl = 0;
        for (Student s : teibl) {
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

    public int getChairs() {
        return chairs;
    }

    public void printStudents() {
        for (Student s : teibl) {
            System.out.println(s);
        }
    }

    public HashSet<Student> getTeibl() {
        return teibl;
    }
}
