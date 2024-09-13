class PartialImplementation implements TwoMethodsInterface {
    
    public void methodOne() {
        System.out.println("Method One implemented.");
    }

    // methodTwo() is not implemented
}

public class Main {
    public static void main(String[] args) {
        PartialImplementation obj = new PartialImplementation();
        obj.methodOne();
    }
}
