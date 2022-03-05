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
public class Manager extends Staff implements ICalculator {

    private int chucdanh;
    double luong;

    public Manager() {
    }

    public Manager(String manv, String tennv, int tuoi, double hsl,
            String ngayvaolam, String bophan, int songayphep, Integer chucdanh) {
        super(manv, tennv, tuoi, hsl, ngayvaolam, bophan, songayphep);
        this.chucdanh = chucdanh;
    }

    public int getChucdanh() {
        return chucdanh;
    }

    public void setChucdanh(int chucdanh) {
        this.chucdanh = chucdanh;
    }

    @Override
    public void inputinfo(ArrayList<Department> arrayListDepartments) {
        super.inputinfo(arrayListDepartments); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void displaySalary() {
        System.out.printf("%5s %20s  %5.2f %15s %10s %5d %10.2f\n", getManv(), getTennv(),
                getHsl(), getNgayvaolam(), getBophan(), getChucdanh(), getLuong());

    }

    @Override
    public void displayInformation() {//%5s %30s %5d %5.2f %15s %10s %5d %5.2f
        String p = null;
        
        if(chucdanh == 8000000){
            p = "Business Leader";
        }else if(chucdanh == 5000000){
            p = "Project Leader";
        }else if(chucdanh == 6000000){
            p = "Technical Leader";
        }
        System.out.printf("%5s %20s %5d %5.2f %15s %10s %5d %12s %20s\n", getManv(), getTennv(), getTuoi(),
                getHsl(), getNgayvaolam(), getBophan(), getSongayphep(),"Manager", p);
    }

    @Override
    public double calculateSalary() {
        luong = super.getHsl() * 5000000 + chucdanh;
        return luong;
    }

}
