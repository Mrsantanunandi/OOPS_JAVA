class Computer{

    String computername;
    public Computer(String computername) {
        this.computername = computername;
    }
    class Desktop{
        int price;
        int ramsize;
        public Desktop(int price, int ramsize) {
            this.price = price;
            this.ramsize = ramsize;
        }
        @Override
        public String toString() {
            return "Desktop :--> [price=" + price + ", ramsize=" + ramsize + ", computername=" + computername + "]";
        }
    }
    class Laptop{
        int price;
        int ramsize;
        public Laptop(int price, int ramsize) {
            this.price = price;
            this.ramsize = ramsize;
        }
        @Override
        public String toString() {
            return "Laptop :--> [price=" + price + ", ramsize=" + ramsize + ", computername=" + computername + "]";
        }
    }
}
public class P2 {
    public static void main(String[] args) {
        Computer obj1=new Computer("HP");
        Computer.Desktop obj2=obj1.new Desktop(100000, 16);
        System.out.println(obj2.toString());

        Computer.Laptop obj3=obj1.new Laptop(80000, 8);
        System.out.println(obj3.toString());
    }
}
