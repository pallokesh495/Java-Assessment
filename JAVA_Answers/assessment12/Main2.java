class ParentClass {
    ParentClass() {
        System.out.println("Parent class default constructor");
    }

    ParentClass(int x) {
        System.out.println("Parent class one-argument constructor: " + x);
    }
}

class ChildClass extends ParentClass {
    ChildClass() {
        super();
        System.out.println("Child class default constructor");
    }

    ChildClass(int y) {
        super(y);
        System.out.println("Child class one-argument constructor: " + y);
    }
}

public class Main2 {
    public static void main(String[] args) {
        new ChildClass();
        new ChildClass(50);
    }
}
