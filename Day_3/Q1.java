package Day_3;

class Employee {
    double bs, grosssalary;

    public Employee(int type) {

        if (type == 1) {
            this.bs = 15000;
        } else if (type == 2) {
            this.bs = 13000;
        } else if (type == 3) {
            this.bs = 13000;
        } else if (type == 4) {
            this.bs = 13000;
        }
    }

    public double gs() {
        double da = bs * 0.90;
        double hra = bs * 0.15;
        double ma = 1000;

        grosssalary = bs + da + hra + ma;
        return grosssalary;
    }

    public double gs(Employee obj) {
        return obj.gs();
    }
}

public class Q1 {
    public static void main(String[] args) {
        System.out.println("\nMenu" + "\n1.Manager" + "\n2.clerk" + "\n3.Account" + "\n4.salesman");
        int c = 1;
        while (c < 5) {
            Employee obj1 = new Employee(c);
            System.out.println("Salary of id: " + c + " " + obj1.gs());
            c++;
        }

    }
}
