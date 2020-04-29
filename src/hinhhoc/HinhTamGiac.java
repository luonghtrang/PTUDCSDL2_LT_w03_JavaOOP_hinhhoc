/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;
import java.lang.Math;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class HinhTamGiac implements Hinhhoc {

    private double a;
    private double b;
    private double c;
    
    /**
     * @return the a
     */
    public double getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(double a) {
        this.a = a;
    }

    /**
     * @return the b
     */
    public double getB() {
        return b;
    }

    /**
     * @param b the b to set
     */
    public void setB(double b) {
        this.b = b;
    }

    /**
     * @return the c
     */
    public double getC() {
        return c;
    }

    /**
     * @param c the c to set
     */
    public void setC(double c) {
        this.c = c;
    }
    
    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập cạnh a: ");
        a = scanner.nextDouble();
        System.out.print("Nhập cạnh b: ");
        b = scanner.nextDouble();
        System.out.print("Nhập cạnh c: ");
        c = scanner.nextDouble();
    }

    @Override
    public void Xuat() {
        System.out.print("Cạnh a: " + a + " - Cạnh b:" + b + " - Cạnh c: " + c);
    }

    @Override
    public double TinhDienTich() {
        double p = (a + b  +c ) / 2;
        double h = 2 * (Math.sqrt(p*(p -a )*(p -b)*(p -c ))/ a);
        
        return (a * h) /2;
    }

    @Override
    public double TinhChuVi() {
        return a + b + c;
    }
    
    public boolean KiemTraTamGiacDeu()
    {
       return a == b && a == c;
    }
}
