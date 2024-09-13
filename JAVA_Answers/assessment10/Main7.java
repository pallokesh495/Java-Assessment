class StaticFinalClass implements StaticFinalInterface {
    
    public void method() {
        System.out.println("Method implementation.");
    }
}

public class Main7 {
    public static void main(String[] args) {
        StaticFinalClass obj = new StaticFinalClass();
        System.out.println("Constant value: " + StaticFinalInterface.CONSTANT);
        obj.method();
    }
}
