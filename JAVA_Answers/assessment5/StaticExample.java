public class StaticExample {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public static void staticMethod1() {
        StaticExample obj = new StaticExample();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    public static void main(String[] args) {
        staticMethod1();
    }
}
