package task1;

public class GraduateStudent extends Student {

    private String department;

    public GraduateStudent(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
    }
}