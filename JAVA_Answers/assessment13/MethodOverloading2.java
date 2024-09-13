class MethodOverloading2 {
    void show(int a) {
        System.out.println("Method with int parameter: " + a);
    }

    void show(double a) {
        System.out.println("Method with double parameter: " + a);
    }

    public static void main(String[] args) {
        MethodOverloading2 obj = new MethodOverloading2();
        obj.show(10);
        obj.show(15.5);
    }
}
