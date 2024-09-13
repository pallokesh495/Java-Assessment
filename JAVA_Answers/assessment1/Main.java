class Car {
    String brand;

    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.showBrand();
    }
}
