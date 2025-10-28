import java.util.Scanner;

public class if_else_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the button for pressing : ");
        int button = sc.nextInt();
        switch (button) {
            case 1:
                System.out.println("Enter the game");
                break;
            case 2:
                System.out.println("Put the gun to kill enemy");
                break;
            case 3:
                System.out.println("Put Awm + MP40 + sniper Ammo + Smg Ammo");
                break;
            default:
                System.out.println("Exit the game and back to the windows screen");
        }
        sc.close();
    }
}
