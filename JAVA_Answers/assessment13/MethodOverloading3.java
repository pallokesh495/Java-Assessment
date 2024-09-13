class MethodOverloading3 {
    void calculate(int a, int b) {
        System.out.println("Method with int parameters: " + (a + b));
    }

    void calculate(double a, double b) {
        System.out.println("Method with double parameters: " + (a + b));
    }

    public static void main(String[] args) {
        MethodOverloadingExample4 obj = new MethodOverloadingExample4();
        obj.calculate(10, 20);
        obj.calculate(10.5, 20.5);
    }
}
