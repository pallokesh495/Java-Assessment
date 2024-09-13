public class StaticExample2 {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public void instanceMethod1() {
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
    }

    public static void main(String[] args) {
        StaticExample2 obj = new StaticExample2();
        obj.instanceMethod1();
    }
}
