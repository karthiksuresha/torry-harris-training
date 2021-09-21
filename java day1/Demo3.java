import java.util.Scanner;

    public class Demo3 {
        public static void main(String[] args) {
            int[] array = new int[5];
            System.out.println("enter the numbers");
            for (int i = 0; i < 5; i++)
            {
                Scanner scanner = new Scanner(System.in);
                array[i] = scanner.nextInt();
            }
            System.out.println("square of the numbers are");
            for (int i = 0; i < 5; i++) {
                int b = array[i] * array[i];
                System.out.println(b);
            }
        }
    }
