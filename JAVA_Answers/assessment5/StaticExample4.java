public class StaticExample4 {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public static void staticMethod1() {
        System.out.println("Inside Static Method 1");
    }

    public void instanceMethod1() {
        staticMethod1();
    }

    public static void main(String[] args) {
        StaticExample4 obj = new StaticExample4();
        obj.instanceMethod1();
    }
}
