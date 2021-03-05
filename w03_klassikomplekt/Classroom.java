import java.util.ArrayList;
import java.util.HashSet;

public class Classroom {
    /**
     * Contains a hashset of tables in the room
     * Contains an arraylist of students standing in the room
     * 
     */
    HashSet<Table> tablesInRoom;
    ArrayList<Student> studentsInRoom;
    String name;
    
    public Classroom(String name) {
        tablesInRoom = new HashSet<>();
        studentsInRoom = new ArrayList<>();
        this.name = name;
    }

    public void addTables(Table table) {
        tablesInRoom.add(table);
    }

    public int getTablesCount() {
        return tablesInRoom.size();
    }

    public int getStudentsCount() {
        return studentsInRoom.size();
    }

    public void printAllStudents() {
        for (Table t : tablesInRoom) {
            for (Student s : t.getTeibl().keySet()) {
                System.out.println(s);
                System.out.println(t.getTeibl().get(s));
            }
        }
    }

    public void addStudentToRoom(Student student) {
        if (studentsInRoom.contains(student)) {
            System.out.println("You are already in the room");
        } else {
            this.studentsInRoom.add(student);
            System.out.println("Hello," + student.getName() + "! You are now in room " + this.name);
        }
        
    }

    public void removeStudent(Student student) {
        if (studentsInRoom.contains(student)) {
            this.studentsInRoom.remove(student);
            System.out.println("Bye, " + student.getName() + "!");
        } else {
            System.out.println("You are not in this room");
        }
    }




}
