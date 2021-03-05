public class Student {
    Gender gender;
    String name;
    Integer age;

    public Student(int age, String name,Gender gender) {
            this.age = age;
            this.name = name;
            this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    public void enterRoom(Classroom room, Student student) {
        room.addStudentToRoom(student);
    }
    public void leaveRoom(Classroom room, Student student) {
        room.removeStudent(student);
    }
}
