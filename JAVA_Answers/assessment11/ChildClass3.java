class ParentClass {
    void parentMethod() {
        System.out.println("Parent Method");
    }
}

class ChildClass3 extends ParentClass {
    void childMethod() {
        this.someOtherMethod(); 
        super.parentMethod(); 
    }

    void someOtherMethod() {
        System.out.println("Some Other Method");
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.childMethod();
    }
}
