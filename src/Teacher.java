public class Teacher {
    private int age;
    private String name;
    private Student[] student = new Student[3];

    public Teacher(int age, String name, Student student0, Student student1, Student student2) {
        this.age = age;
        this.name = name;
        this.student[0] = student0;
        this.student[1] = student1;
        this.student[2] = student2;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student[] getStudent() {
        return student;
    }

    public void setStudent(Student[] student) {
        this.student = student;
    }
}