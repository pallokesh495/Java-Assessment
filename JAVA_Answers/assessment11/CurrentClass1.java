class CurrentClass1 {
    int value;

    CurrentClass() {
        this(100); 
    }

    CurrentClass(int value) {
        this.value = value;
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {
        new CurrentClass();
    }
}
