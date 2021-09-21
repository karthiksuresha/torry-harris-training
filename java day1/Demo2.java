import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        int n;
        String username;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        n = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter the username");
        username = scanner1.nextLine();
        for(int i=0;i<n;i++)
        {
            System.out.println("username is "+username);
        }
    }
}
