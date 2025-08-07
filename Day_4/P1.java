package Day_4;

import java.util.Scanner;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + Math.pow(p2.y - p1.y, 2));
    }
}

public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1,y1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.print("Enter x2,y2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        Point obj = new Point(x1, y1);
        Point obj1 = new Point(x2, y2);

        double ans = Point.distance(obj, obj1);

        System.out.println("Distance b/w points is: " + ans);
        sc.close();
    }
}
