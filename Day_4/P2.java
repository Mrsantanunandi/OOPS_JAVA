package Day_4;

import java.util.Scanner;

class Complex {
    double real, imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    static Complex add(Complex n1, Complex n2) {
        double x = n1.real + n2.real;
        double y = n1.imaginary + n2.imaginary;

        return new Complex(x, y);
    }

    static Complex sub(Complex n1, Complex n2) {
        double x = n1.real - n2.real;
        double y = n1.imaginary - n2.imaginary;

        return new Complex(x, y);
    }

    static Complex mul(Complex n1, Complex n2) {
        double w = (n1.real * n2.real);
        double x = (n1.real * n2.imaginary);
        double y = (n2.real * n1.imaginary);
        double z = (n1.imaginary * n2.imaginary);

        return new Complex(w - z, x + y);
    }

    static double modulus(Complex n1) {
        return Math.sqrt(Math.pow(n1.real, 2) + Math.pow(n1.imaginary, 2));
    }

    static Complex comp(Complex n1) {
        return new Complex(n1.real, (-1) * (n1.imaginary));
    }

    @Override
    public String toString() {
        return " " + real + "  +  " + imaginary + "i";
    }

}

public class P2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first real part of the num: ");
        double r1 = sc.nextDouble();

        System.out.println("Enter first imaginary part of the number: ");
        double i1 = sc.nextDouble();

        System.out.println("Enter 2:  real part of the num: ");
        double r2 = sc.nextDouble();

        System.out.println("Enter 2: imaginary part of the number: ");
        double i2 = sc.nextDouble();

        System.out.println("First Complex num is:   " + r1 + " +   " + i1 + "i");
        System.out.println("Second Complex num is:   " + r2 + " +   " + i2 + "i");

        Complex obj1 = new Complex(r1, i1);
        Complex obj2 = new Complex(r2, i2);

        System.out.println("ADDITION  : " + Complex.add(obj1, obj2));
        System.out.println("DIFF : " + Complex.sub(obj1, obj2));
        System.out.println("PRODUCT : " + Complex.mul(obj1, obj2));
        System.out.println("MODULUS OF 1ST COMPLEX NUM : " + Complex.modulus(obj1));
        System.out.println("MODULUS OF 2ND COMPLEX NUM : " + Complex.modulus(obj2));
        System.out.println("COMPLIMENT OF 1ST COMPLEX NUM : " + Complex.comp(obj1));
        System.out.println("COMPLIMENT OF 2ND COMPLEX NUM : " + Complex.comp(obj2));
        sc.close();

    }
}
