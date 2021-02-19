import java.util.HashSet;

public class Classroom {
    HashSet<Table> room;

    
    public Classroom() {
        room = new HashSet<>();
    }

    public void addTables(Table table) {
        room.add(table);
    }

    public int getTablesCount() {
        return room.size();
    }

    public Table getTable() {
        for (Table teibl : room) {
            if (teibl.getSeatsTaken() < teibl.getChairs()) {
                return teibl;
            }

        }
        return null;
    }

    public HashSet<Table> getRoom() {
        return room;
    }

    public void printStudents() {
        for (Table t : room) {
            for (Student s : t.getTeibl()) {
                System.out.println(s);
            }
        }
    }


}
