class ImplementingClass implements ChildInterface {
    
    public void parentMethod() {
        System.out.println("Parent method.");
    }

    
    public void childMethod() {
        System.out.println("Child method.");
    }
}

public class Main5 {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.parentMethod();
        obj.childMethod();
    }
}
