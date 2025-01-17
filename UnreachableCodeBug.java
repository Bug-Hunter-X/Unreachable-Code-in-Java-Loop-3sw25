public class MyClass {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 5) {
                break; // Exit loop at i = 5
            }
            if (i == 8) { // This condition is unreachable
                System.out.println("Unreachable code");
            }
        }
    }
}