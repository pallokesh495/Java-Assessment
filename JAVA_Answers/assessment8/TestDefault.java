package p1;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample example = new DefaultExample();
        System.out.println("Default field: " + example.defaultField);
        example.defaultMethod();
    }
}

