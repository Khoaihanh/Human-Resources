/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resources;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Employee extends Staff implements ICalculator {

    private double ovtime;
    double luong;

    public Employee() {
    }

    public Employee(String manv, String tennv, int tuoi, double hsl,
            String ngayvaolam, String bophan, int songayphep, double ovtime) {
        super(manv, tennv, tuoi, hsl, ngayvaolam, bophan, songayphep);
        this.ovtime = ovtime;
    }

    @Override
    public void inputinfo(ArrayList<Department> arrayListDepartments) {
        super.inputinfo(arrayListDepartments); //To change body of generated methods, choose Tools | Templates.

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap gio lam them cua nhan vien:  ");
        ovtime = sc.nextDouble();
    }

    public double getOvtime() {
        return ovtime;
    }

    public void setOvtime(double ovtime) {
        this.ovtime = ovtime;
    }

    @Override
    public void displayInformation() {
        //System.out.println("Mã NV: " + getManv());
        //System.out.println("Tên NV: " + getTennv());
        //System.out.println("Tuổi: " + getTuoi());
        // System.out.println("Hệ Số Lương: " + getHsl());
        //System.out.println("Ngày vào làm: " + getNgayvaolam());
        //System.out.println("Bộ phận: " + getBophan());
        // System.out.println("Số ngày phép: " + getSongayphep());
        // System.out.println("Số gipừ làm thêm: " + ovtime);
        System.out.printf("%5s %20s %5d %5.2f %15s %10s %5d %12s %20s %5.2f \n", getManv(), getTennv(), getTuoi(),
                getHsl(), getNgayvaolam(), getBophan(), getSongayphep(),"Employee","", getOvtime());
    }

    @Override
    public void displaySalary() {//%5s %20s  %5.2f %15s %10s %15d %10.2f
        System.out.printf("%5s %20s  %5.2f %15s %10s  %5.2f  %5.2f\n", getManv(), getTennv(),
                getHsl(), getNgayvaolam(), getBophan(), getOvtime(), getLuong());
    }

  
    @Override
    public double calculateSalary() {
        luong = (super.getHsl() * 3000000) + (ovtime * 200000);
        return luong;
    }

}
