public class StaticExample6 {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public static void staticMethod1() {
        System.out.println("Inside Static Method 1");
    }

    public void instanceMethod1() {
        System.out.println("Inside Instance Method 1");
    }

    public static void main(String[] args) {
        StaticExample6 obj = new StaticExample6();

        staticMethod1();
        obj.instanceMethod1();
    }
}
