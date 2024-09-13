class MethodOverloading1 {
    void display(int a) {
        System.out.println("Method with one parameter: " + a);
    }

    void display(int a, int b) {
        System.out.println("Method with two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        obj.display(10);
        obj.display(20, 30);
    }
}