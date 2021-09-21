import java.util.Scanner;

public class Demo7
{
    public static void main(String[] args)
    {
        int[][] mat = new int[3][3];
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array elements");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                n = scanner.nextInt();
                mat[i][j] = n;
            }
        }
        System.out.println("principle diagonal elements are:");
        for (int i = 0; i < 3; i++)
        {
            int j = i;
            System.out.print(mat[i][j] + " ");
        }
        System.out.println();
        System.out.println("secondary diagonal elements are:");
        int i, j;
        for (i = 0; i < 3; i++)
        {
            for (j = 0; j < 3; j++)
            {
                if ((i + j) == mat.length - 1)
                {
                    System.out.print(mat[i][j]+" ");
                }
            }
        }
    }
}
