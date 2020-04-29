/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hinhhoc;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author OS
 */
public class MangHinhHoc {
    private ArrayList<Hinhhoc> list;
    
    //methods
    public void Nhap()
    {
        Scanner scanner = new Scanner(System.in);
        list = new ArrayList<Hinhhoc>();
        do
        {
            System.out.print("Nhap lua chon: 1-hinh chu nhat\t 2-hinh tron \t 3-tam giac\t 0-exit: ");
            int chon  = scanner.nextInt();
            
            Hinhhoc a;
            if(chon ==  1)
            {
               a = new HinhChuNhat();
                           
                a.Nhap();
                list.add(a);
            }
            else if(chon == 2)
            {
                a = new HinhTron();

                a.Nhap();
                list.add(a);         
            }
            else if(chon == 3 )
            {
                a = new HinhTamGiac();
                            
                a.Nhap();
                list.add(a);
            }
            else 
            {
                System.out.println("Thoat!!");
                break;
            }

        }while(true);
    }
    
    
    public void Xuat()
    {
//        C1:
//        for(int i = 0; i< list.size(); i++)
//        {
//            list.get(i).Xuat();
//        }
//        C2:
        for (Hinhhoc item : list) {
            item.Xuat();
        }
    }
    
    public double TongDienTich()
    {
        double s = 0;
        for(Hinhhoc item : list)
        {
            s += item.TinhDienTich();
        }
        
        return s;
    }
    
    public double TongChuVi()
    {
        double s = 0;
        for(Hinhhoc item : list)
        {
            s += item.TinhChuVi();
        }
        
        return s;
    }
    
    public double ChuViLonNhat()
    {
        double max = list.get(0).TinhChuVi();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(max < list.get(i).TinhChuVi())
            {
                max = list.get(i).TinhChuVi();
            }
        }
        
        return max;
    }
    
    public double ChuViNhoNhat()
    {
        double min = list.get(0).TinhChuVi();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(min > list.get(i).TinhChuVi())
            {
                min = list.get(i).TinhChuVi();
            }
        }
        
        return min;
    }
    
    public double DienTichLonNhat()
    {
        double max = list.get(0).TinhDienTich();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(max < list.get(i).TinhDienTich())
            {
                max = list.get(i).TinhDienTich();
            }
        }
        
        return max;
    }
    
    public double DienTichNhoNhat()
    {
        double min = list.get(0).TinhDienTich();
        
        for(int i = 1; i < list.size(); i++)
        {
            if(min > list.get(i).TinhDienTich())
            {
                min = list.get(i).TinhDienTich();
            }
        }
        
        return min;
    }
    
    /**
     * @return the list
     */
    public ArrayList<Hinhhoc> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<Hinhhoc> list) {
        this.list = list;
    }
    
    //constructor
    
    public MangHinhHoc()
    {
        list = null;
    }
}
