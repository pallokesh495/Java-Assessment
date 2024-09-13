class CurrentClass2 {
    int value;

    CurrentClass() {
        this(100); 
    }

    CurrentClass(int value) {
        this.value = value;
        System.out.println("Argument Constructor: Value = " + value);
    }

    public static void main(String[] args) {
        new CurrentClass();
    }
}
