class ParentClass {
    ParentClass() {
        System.out.println("Parent Constructor");
    }
}

class ChildClass2 extends ParentClass {
    ChildClass() {
        super();
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        new ChildClass();
    }
}
