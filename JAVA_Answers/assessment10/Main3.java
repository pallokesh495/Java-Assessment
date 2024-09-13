class CommonMethodClass implements FirstInterface_A, SecondInterface_A {
    
    public void commonMethod() {
        System.out.println("Common method implemented.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        CommonMethodClass obj = new CommonMethodClass();
        obj.commonMethod();
    }
}
