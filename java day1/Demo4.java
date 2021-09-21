import java.util.Scanner;

public class Demo4 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner (System.in);
        System.out.println("enter the number");
        n = scanner.nextInt();
        int k=1;
        for (int i = 1; i <= n; ++i)
        {
            for (int j =1; j <= i; ++j)
            {
                System.out.print(k+" ");
                k++;
            }
            System.out.println();
        }
    }
}
