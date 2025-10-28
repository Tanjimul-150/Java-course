class student {
    String name;
    String roll;

    public void getinfo() {
        System.out.println("The name of this student is : " + this.name);
        System.out.println("The roll of this student is :" + this.roll);
    }
}

class pen {
    String color;
    double size;

    public void color() {
        System.out.println("The color of this pen is: " + this.color);
    }

    public void size() {
        System.out.println("The size of this pen is :" + this.size);
    }
}

public class oops {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Tanjimul";
        s1.roll = "C243016";
        s1.getinfo();
        pen p1 = new pen();
        p1.color = "Red";
        p1.size = 4.6;
        p1.color();
        p1.size();
    }
}
