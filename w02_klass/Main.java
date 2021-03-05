import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        
        Student mark = new Student(12, "Johan", Gender.BOY);
        Student sandy = new Student(13, "Sandy", Gender.GIRL);
        Student josh = new Student(11, "Josh", Gender.BOY);
        Student phil = new Student(12, "Phil", Gender.BOY);
        Student ruth = new Student(11, "Ruth", Gender.GIRL);
        Student nancy = new Student(13, "Nancy", Gender.GIRL);

        Classroom mathematicsRoom = new Classroom();

        Table boysTable1 = new Table(2);
        Table boysTable2 = new Table(2);
        Table girlsTable1 = new Table(2);
        Table girlsTable2 = new Table(2);

        System.out.println(mathematicsRoom.getTablesCount()); // enne laudade lisamist

        mathematicsRoom.addTables(boysTable1);
        mathematicsRoom.addTables(boysTable2);
        mathematicsRoom.addTables(girlsTable1);

        System.out.println(mathematicsRoom.getTablesCount()); // peale laudade lisamist
        System.out.println(mathematicsRoom.getRoom());

        mathematicsRoom.getTable().addStudentToSit(mark);
        mathematicsRoom.getTable().addStudentToSit(josh);
        mathematicsRoom.getTable().addStudentToSit(sandy);
        mathematicsRoom.getTable().addStudentToSit(josh); //can't sit yet, girls table
        mathematicsRoom.getTable().addStudentToSit(ruth);
        mathematicsRoom.getTable().addStudentToSit(phil);
        mathematicsRoom.getTable().addStudentToSit(nancy); //can't sit yet, boys table
        mathematicsRoom.getTable().addStudentToSit(josh); //can sit now

        mathematicsRoom.printStudents();

       


    }
    
}