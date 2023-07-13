import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of headquarters");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Enter the value of [%d][%d]: ", i, j);
                mat[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.println("=================================");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] +  " ");
            }
            System.out.println();
        }

        System.out.println("=================================");
        System.out.println("Main diagonal: ");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] +  " ");
        }
    }
}
