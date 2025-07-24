import java.util.Scanner;

class Boxd {
    int height;
    int width, depth;

    public void setval(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public void getval() {
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Depth: " + depth);
    }

}

public class P3 {
    public static void main(String[] args) {
        int h, l, w;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter Depth: ");
        l = sc.nextInt();
        System.out.print("Enter Width: ");
        w = sc.nextInt();
        Boxd obj = new Boxd();
        obj.setval(h, w, l);
        obj.getval();
    }
}