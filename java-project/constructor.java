class cricketer {
    String name;
    int position;
    String type;

    cricketer() {
        System.out.println("Default constructor called: ");
    }

    cricketer(String name, int position, String type) {
        this.name = name;
        this.position = position;
        this.type = type;
    }

    public void info() {
        System.out.println("The name of this player is " + name);
        System.out.println("The playing position is at number:" + position);
        System.out.println("He is an " + type);
    }
}

public class constructor {
    public static void main(String[] args) {
        cricketer player1 = new cricketer("Shakib", 3, "All-Rounder");
        // player1.cricketer("Shakib",5,"All-rounder");
        // player1.name="Shakib";
        // player1.position=3;
        // player1.type="All-Rounder";
        player1.info();
    }
}
