class SubClass extends AbstractClass {
   
    void abstractMethod() {
        System.out.println("Implementation of abstract method.");
    }

    void accessNonAbstractMethod() {
        nonAbstractMethod();
    }
}
