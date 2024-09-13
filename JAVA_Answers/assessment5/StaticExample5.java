public class StaticExample5 {
    static String staticVar1 = "Static Var 1";
    static String staticVar2 = "Static Var 2";

    String instanceVar1 = "Instance Var 1";
    String instanceVar2 = "Instance Var 2";

    public static void main(String[] args) {
        StaticExample5 obj = new StaticExample5();

        System.out.println(staticVar1);
        System.out.println(staticVar2);

        System.out.println(obj.instanceVar1);
        System.out.println(obj.instanceVar2);
    }
}
