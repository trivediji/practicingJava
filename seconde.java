interface INTER-1 {
    void disp();
}

class Student implements INTER-1 {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void disp() {
        System.out.println("ID: " + id + ", Name: " + name);
    }

    void nonlfaceMethod() {
        System.out.println("This is a non-interface method.");
    }
}

public class seconde {
    public static void main(String[] args) {
        Student s1 = new Student(1, "John");
        s1.disp();
        s1.nonlfaceMethod();

        INTER-1 s2 = new Student(2, "Jane");
        s2.disp();

        // The following line will cause a compile-time error
        // because the reference object of the interface INTER-1
        // cannot access the non-interface method nonlfaceMethod().
        // s2.nonlfaceMethod();
    }
}