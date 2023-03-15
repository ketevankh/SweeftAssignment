import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        scanner.close();

        System.out.printf("Number of variants is: %d%n", n, countVariants(n));
    }
    public static int countVariants(int stearsCount) {
        if (stearsCount <= 0) {
            return 0;
        } else if (stearsCount == 1 || stearsCount == 2) {
            return 1;
        } else {
            int[] variants = new int[stearsCount + 1];
            variants[1] = 1;
            variants[2] = 2;
            for (int i = 3; i <= stearsCount; i++) {
                variants[i] = variants[i - 1] + variants[i - 2];
            }
            return variants[stearsCount];
        }
    }
}
