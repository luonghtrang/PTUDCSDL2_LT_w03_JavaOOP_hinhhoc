/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

import java.util.Scanner;

/**
 *
 * @author OS
 */
public class HinhTron implements Hinhhoc{
    private double r;
    private double PI = 3.14;
    
    /**
     * @return the r
     */
    public double getR() {
        return r;
    }

    /**
     * @param r the r to set
     */
    public void setR(double r) {
        this.r = r;
    }    
    
    @Override
    public double TinhDienTich(){
        return r * r * Math.PI;
    }
    
    @Override
    public void Xuat(){
        //super.Xuat()
        System.out.println("Bán kính R = " + this.r);
    }

    @Override
    public void Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ban kinh R: ");
        r = scanner.nextDouble();
    }

    @Override
    public double TinhChuVi() {
        return 2 * PI * r;
    }


}
