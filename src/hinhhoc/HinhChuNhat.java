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
public class HinhChuNhat implements Hinhhoc {
    private double chieudai;
    private double chieurong;
     
    /**
     * @return the chieudai
     */
    public double getChieudai() {
        return chieudai;
    }

    /**
     * @param chieudai the chieudai to set
     */
    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    /**
     * @return the chieurong
     */
    public double getChieurong() {
        return chieurong;
    }

    /**
     * @param chieurong the chieurong to set
     */
    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }
    
    
    @Override
    public void Xuat(){
        System.out.println("Chiều dài = " + this.getChieudai());
        System.out.println("Chiều rộng = " + this.getChieurong());
    }
    
    @Override
    public void Nhap(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieudai = scan.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieurong = scan.nextDouble();
    
    }   

    @Override
    public double TinhChuVi() {
        return (chieudai + chieurong) * 2;
    }
    
    @Override
    public double TinhDienTich(){
        return getChieudai()*getChieurong();
    }
    
    public boolean KiemTraHinhVuong()
    {
        return chieudai == chieurong;
    }
    
}
