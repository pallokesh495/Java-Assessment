interface CallableInterface {
    void callMethod();
}

class CallableClass implements CallableInterface {
    @Override
    public void callMethod() {
        System.out.println("Interface method called.");
    }
}

public class Main {
    public static void main(String[] args) {
        CallableInterface obj = new CallableClass();
        obj.callMethod();
    }
}
