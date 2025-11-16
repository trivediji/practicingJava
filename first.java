interface Inter {
    void disp();
}

class Student implements Inter {
    static String x = 10;

    public Student(String string, int i) {
    }

    public static void disp() {
        System.out.println("Value of x: " + x);
    }

    public void display() {
    }
}

public class first {
    public static void main(String[] args) {
        Student.x = 20;
        Student.disp();

        try {
            Student.x = "Hello";
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}