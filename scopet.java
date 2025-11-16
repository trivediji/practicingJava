public class scopet {
   
    static int classLevelVariable = 100;

    public static void main(String[] args) {
        
        int localVariable = 50;
        
        System.out.println("Inside main method:");
        System.out.println("classLevelVariable: " + classLevelVariable);
        System.out.println("localVariable: " + localVariable); 
        
       
        methodWithScope();
        
       
    }
    
    public static void methodWithScope() {
        // This is a local variable for the methodWithScope() method.
        int methodLocalVariable = 25;
        
        System.out.println("\nInside methodWithScope() method:");
        System.out.println("classLevelVariable: " + classLevelVariable); // Accessing class-level variable
        System.out.println("methodLocalVariable: " + methodLocalVariable); // Accessing local variable for this method
        
        // Attempt to access localVariable here (outside its scope) will result in a compilation error.
    }
}
