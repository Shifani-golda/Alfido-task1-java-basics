package task1;
public class Main {

    public static void main(String[] args) {

        int[] marks = {80, 85, 90};

        for(int mark : marks) {
            System.out.println("Mark: " + mark);
        }

        Student s1 = new GraduateStudent(101,"Shifani","CSE");

        s1.display();

        if(marks[0] > 50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}