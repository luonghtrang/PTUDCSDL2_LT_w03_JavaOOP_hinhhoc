/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;

/**
 *
 * @author OS
 */
public interface Hinhhoc {
    public void Nhap();
    public void Xuat();
    public double TinhDienTich();
    public double TinhChuVi();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MangHinhHoc a = new MangHinhHoc();
        a.Nhap();
        a.Xuat();
        
        System.out.println("");
        System.out.println("Tong dien tich: "+ a.TongDienTich());
        System.out.println("Tong chu vi: "+ a.TongChuVi());
        System.out.println("Dien tich lon nhat: "+ a.DienTichLonNhat());
        System.out.println("Dien tich nho nhat: "+ a.DienTichNhoNhat());
        System.out.println("Chu vi lon nhat: "+ a.ChuViLonNhat());
        System.out.println("Chu vi nho nhat: "+ a.ChuViNhoNhat());
    }
    
}
