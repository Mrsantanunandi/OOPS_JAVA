class Car{
    static{
        System.out.println("This is a static block");
    }
    String carname;
    void display()
    {
        System.out.println("Car name is: "+carname);
    }
    public Car(String carname) {
        this.carname = carname;
    }
    
}
public class P1 {
    public static void main(String[] args) {
        Car obj=new Car("Bugati");
        obj.display();
        Car obj1=new Car("THAR");
        obj1.display();
    }
}
