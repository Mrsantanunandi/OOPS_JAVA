class Box
{
    int l,h,w;

    public Box(int l, int h, int w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }
    void volume()
    {
        System.out.println("Volume of Superclass: " + l * h * w);
    }
}
class SubBox extends  Box
{
    public SubBox(int l, int h, int w) {
        super(l, h, w);
    }
    void volume(int wt)
    {
        System.out.println("Weight of the Sub box: "+ wt);
        System.out.println("Volume is subclass: " + l * h * w);
    }
}

public class ProveOverloading {
    public  static void main(String[] args)
    {
        Box obj=new Box(10,20,10);
        obj.volume();

        SubBox obj1=new SubBox(10,20,20);
        obj1.volume(50);
    }

}
