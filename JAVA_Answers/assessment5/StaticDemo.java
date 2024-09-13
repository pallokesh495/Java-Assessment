public class StaticDemo{
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public static void staticMethod1() {
        System.out.println("Inside Static Method 1");
    }

    public static void staticMethod2() {
        System.out.println("Inside Static Method 2");
    }

    public void instanceMethod1() {
        System.out.println("Inside Instance Method 1");
    }

    public void instanceMethod2() {
        System.out.println("Inside Instance Method 2");
    }

    public static void main(String[] args) {
        StaticDemo obj = new StaticDemo();

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
