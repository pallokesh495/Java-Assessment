public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Calling methods for instance of A:");
        a.methodA1();
        a.methodA2();
        a.methodOverride();

        System.out.println("\nCalling methods for instance of B:");
        b.methodA1();
        b.methodA2();
        b.methodB1();
        b.methodB2();
        b.methodOverride();

        System.out.println("\nCalling methods for instance of C:");
        c.methodA1();
        c.methodA2();
        c.methodB1();
        c.methodB2();
        c.methodC1();
        c.methodC2();
        c.methodOverride();

        A aRef = new B();
        aRef.methodOverride();

        aRef = new C();
        aRef.methodOverride();
    }
}
