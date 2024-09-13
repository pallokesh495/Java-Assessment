class ImplementingClass implements SimpleInterface {
 
    public void singleMethod() {
        System.out.println("Method implemented.");
    }
}

public class Main {
    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();
        obj.singleMethod();
    }
}
