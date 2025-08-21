import java.util.Scanner;

public class Room
{
    int length,breadth;

    public Room(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    void calc_area(String name)
    {
        System.out.println(name +"Area is: " + length * breadth);
    }
}
class Bedroom extends  Room
{
    boolean attach_bathroom,study_table,night_lamp;

    public Bedroom(int length, int breadth, boolean attach_bathroom, boolean study_table, boolean night_lamp) {
        super(length, breadth);
        this.attach_bathroom = attach_bathroom;
        this.study_table = study_table;
        this.night_lamp = night_lamp;
    }
    void display() {

        String name= "Bedroom";
        calc_area(name);
        System.out.println( "\nBedroom-->" +
                "\nattach_bathroom=" + attach_bathroom +
                "\nstudy_table=" + study_table +
                "\nnight_lamp=" + night_lamp );
    }
}
class  Drawing_room extends  Room{

    boolean sofa,wall_cabinate;

    public Drawing_room(int length, int breadth, boolean sofa, boolean wall_cabinate) {
        super(length, breadth);
        this.sofa = sofa;
        this.wall_cabinate = wall_cabinate;
    }

    void display()
    {
        String name= "drawingroom";
        calc_area(name);
        System.out.println("\nDrawing_room-->" +
                "\nsofa=" + sofa +
                "\nwall_cabinate=" + wall_cabinate);
    }
}
class House{
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int l,b;
        System.out.println("Enter lenght: ");
        l=sc.nextInt();
        System.out.println("Enter breadth: ");
        b=sc.nextInt();
        boolean attach_bathroom,study_table,night_lamp,sofa,wall_cab;
        System.out.println("attach_bathroom(true/false): ");
        attach_bathroom=sc.nextBoolean();
        System.out.println("study_table(true/flase): ");
        study_table=sc.nextBoolean();
        System.out.println("night_lamp(true/false): ");
        night_lamp=sc.nextBoolean();
        System.out.println("sofa(true/false): ");
        sofa=sc.nextBoolean();
        System.out.println("Wall Cabinate(true/false): ");
        wall_cab=sc.nextBoolean();
        Bedroom obj=new Bedroom(l,b,attach_bathroom,study_table,night_lamp);
        obj.display();

        Drawing_room obj1=new Drawing_room(l,b,sofa,wall_cab);
        obj1.display();
        sc.close();
    }
}

