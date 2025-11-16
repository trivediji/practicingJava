interface FirstInterface {
    void display();
}
interface SecondInterface extends FirstInterface {
    void displayWithMessage(String message);
}
public class third implements SecondInterface {
    @Override
    public void display() {
        System.out.println("Display method from FirstInterface");
     }

    @Override
    public void displayWithMessage(String message) {
        System.out.println("Display method from SecondInterface with message: " + message);
}

     public static void main(String[] args) {
    third main = new third();
        main.display();
    main.displayWithMessage("Hello, World!");
    }
}