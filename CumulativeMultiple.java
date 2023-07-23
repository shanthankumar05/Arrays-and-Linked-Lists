
import java.util.Scanner;
public class CumulativeMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] cumulativeMultiple = new int[n];
        cumulativeMultiple[0] = arr[0];
        for (int i = 1; i < n; i++) {
            try {
                cumulativeMultiple[i] = cumulativeMultiple[i - 1] * arr[i];
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
        System.out.println("C M : ");
        for (int i = 0; i < n; i++) {
            System.out.print(cumulativeMultiple[i] + " ");
        }
    }
}