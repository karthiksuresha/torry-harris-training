import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args) {
        int[][] mat = new int[3][3];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array elements");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                n = scanner.nextInt();
                mat[i][j] = n;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}