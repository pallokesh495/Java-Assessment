class ParentClass {
    int parentValue = 20;
}

class ChildClass extends ParentClass {
    int childValue = 10;

    void printParentValue() {
        System.out.println(super.parentValue); 
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.printParentValue();
    }
}
