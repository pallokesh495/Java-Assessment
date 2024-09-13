public class VariableScope{
    static int var = 10;

    public static void main(String[] args) {
        int var = 20;
        System.out.println(var);
        System.out.println(VariableScopeExample.var);
    }
}
