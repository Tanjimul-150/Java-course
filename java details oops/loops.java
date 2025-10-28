import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner in1 = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in1.nextInt();
        System.out.print("Enter the number for table: ");
        int n = in1.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.println(n + "*" + i + "=" + n * i);
        }
        in1.close();
    }
}
