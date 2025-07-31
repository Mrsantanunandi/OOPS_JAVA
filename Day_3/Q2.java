package Day_3;

import java.util.Scanner;

class Box {
    int height;
    int width, depth;

    public Box(int height, int width, int depth) {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public Box() {
        this.height = 20;
        this.width = 20;
        this.depth = 20;
    }

    public Box(Box obj) {
        height = obj.height;
        width = obj.width;
        depth = obj.depth;
    }

    public int area() {
        return 2 * (height * width + width * depth + depth * height);
    }

    public int volume() {
        return height * width * depth;
    }
}

public class Q2 {
    public static void main(String[] args) {
        int h, l, w;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        h = sc.nextInt();
        System.out.print("Enter Depth: ");
        l = sc.nextInt();
        System.out.print("Enter Width: ");
        w = sc.nextInt();

        Box obj = new Box(h, w, l);
        int area = obj.area();
        int vol = obj.volume();
        System.out.println("Area is: " + area);
        System.out.println("Volume is : " + vol);

        Box obj1 = new Box();
        int area1 = obj1.area();
        int vol1 = obj1.volume();
        System.out.println("Area is: " + area1);
        System.out.println("Volume is : " + vol1);

        Box obj2 = new Box(obj1);
        int area2 = obj2.area();
        int vol2 = obj2.volume();
        System.out.println("Area is: " + area2);
        System.out.println("Volume is : " + vol2);

        sc.close();

    }
}
