class MultiInterfaceClass implements FirstInterface, SecondInterface {
    
    public void methodOne() {
        System.out.println("Method One.");
    }

    @Override
    public void methodTwo() {
        System.out.println("Method Two.");
    }
}

public class Main2 {
    public static void main(String[] args) {
        MultiInterfaceClass obj = new MultiInterfaceClass();
        obj.methodOne();
        obj.methodTwo();
    }
}
