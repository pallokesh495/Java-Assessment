package package2;

import package1.ProtectedExample;

public class ChildClass extends ProtectedExample {
    public void accessProtected() {
        System.out.println("Protected field: " + protectedField);
        protectedMethod();
    }
}
