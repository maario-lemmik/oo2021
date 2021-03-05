import java.io.PushbackInputStream;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        //Populate students
        Student johan = new Student(12, "Johan", Gender.BOY);
        Student sandy = new Student(13, "Sandy", Gender.GIRL);
        Student josh = new Student(11, "Josh", Gender.BOY);
        Student phil = new Student(12, "Phil", Gender.BOY);
        Student ruth = new Student(11, "Ruth", Gender.GIRL);
        Student nancy = new Student(13, "Nancy", Gender.GIRL);

        //Create rooms
        Classroom mathematicsRoom = new Classroom("Maths");

        //Build tables for room
        Table boysTable1 = new Table();
        Table boysTable2 = new Table();
        Table girlsTable1 = new Table();
        Table girlsTable2 = new Table();

        System.out.println(mathematicsRoom.getTablesCount()); // enne laudade lisamist

        mathematicsRoom.addTables(boysTable1);
        mathematicsRoom.addTables(boysTable2);
        mathematicsRoom.addTables(girlsTable1);

        System.out.println(mathematicsRoom.getTablesCount()); // peale laudade lisamist

        mathematicsRoom.printAllStudents();

        johan.enterRoom(mathematicsRoom, johan);
        johan.enterRoom(mathematicsRoom, johan);

        johan.leaveRoom(mathematicsRoom, johan);
        johan.leaveRoom(mathematicsRoom, johan);
        
        mathematicsRoom.printAllStudents();


        //HOMEWORK
        Homework hm = new Homework("1");
        hm.getCharOccurences();

    }
    
}