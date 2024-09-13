class CurrentClass {
    int value = 10;

    void printValue() {
        System.out.println(this.value); 
    }

    public static void main(String[] args) {
        CurrentClass obj = new CurrentClass();
        obj.printValue();
    }
}
