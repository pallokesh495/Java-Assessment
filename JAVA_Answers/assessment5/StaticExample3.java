public class StaticExample3 {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public void instanceMethod1() {
        System.out.println("Inside Instance Method 1");
    }

    public static void staticMethod1() {
        StaticExample3 obj = new StaticExample3();
        obj.instanceMethod1();
    }

    public static void main(String[] args) {
        staticMethod1();
    }
}
