import java.util.Scanner;

public class SortOddEvenNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Sort the array such that all the odd numbers are placed after the even numbers.
        int evenIndex = 0;
        int oddIndex = n - 1;
        while (evenIndex < oddIndex) {
            while (arr[evenIndex] % 2 == 0) {
                evenIndex++;
            }
            while (arr[oddIndex] % 2 == 1) {
                oddIndex--;
            }

            if (evenIndex < oddIndex) {
                int temp = arr[evenIndex];
                arr[evenIndex] = arr[oddIndex];
                arr[oddIndex] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}