public class EvenOddSwitch {
    public static void main(String[] args) {
        int num = 4;

        switch (num % 2) {
            case 0:
                System.out.println(num + " is even.");
                break;
            case 1:
                System.out.println(num + " is odd.");
                break;
        }
    }
}
