
public class TestRecursive {
    private static void printNum(int n) {
        // Base case
        if (n == 0) {
            return;
        }
        // Recursive case
        System.out.println("WWW");
        printNum(n-1);
        System.out.print(n + " ");
    }

    public static void main( String args[] ) {
        // Recursive method called here
        printNum(3);
    }
}