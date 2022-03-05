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
public abstract class Staff {

    // mã nhân viên, tên nhân viên, tuổi nhân viên, hệ số lương,
    //  ngày vào làm, bộ phận làm việc, số ngày nghỉ phépvao
    private String manv;
    private String tennv;
    private int tuoi;
    private double hsl;
    private String ngayvaolam;
    private String bophan;
    private int songayphep;
    private double luong;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }

    public Staff() {
    }

    public Staff(String manv, String tennv, int tuoi, double hsl, String ngayvaolam,
            String bophan, int songayphep) {
        this.manv = manv;
        this.tennv = tennv;
        this.tuoi = tuoi;
        this.hsl = hsl;
        this.ngayvaolam = ngayvaolam;
        this.bophan = bophan;
        this.songayphep = songayphep;

    }

    public void inputinfo(ArrayList<Department> arrayListDepartments) {//(int manv, String tennv, int tuoi, double hsl, String ngayvaolam,
        // String bophan, int songayphep)
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien: ");
        manv = sc.nextLine();
        System.out.println("Nhap ten nhan vien: ");
        tennv = sc.nextLine();
        System.out.println("Nhap tuoi nhan vien: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap he so luong cua nhan vien: ");
        hsl = Double.parseDouble(sc.nextLine());
        System.out.println("Nhap ngay vao lam");
        ngayvaolam = sc.nextLine();
        System.out.println("Nhap bo phan: ");
        while (true) {
            bophan = sc.nextLine();
            boolean isFind1 = false;
            for (int i = 0; i < arrayListDepartments.size(); i++) {
                if (arrayListDepartments.get(i).getTenbp().equalsIgnoreCase(bophan)) {
                    isFind1 = true;
                }
            }
            if (isFind1) {
                break;
            } else {
                System.out.println("Ten bo phan khong ton tai");
            }

        }

       
        System.out.println("Nhap ngay phep: ");
        songayphep = Integer.parseInt(sc.nextLine());

    }

    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getTennv() {
        return tennv;
    }

    public void setTennv(String tennv) {
        this.tennv = tennv;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getHsl() {
        return hsl;
    }

    public void setHsl(double hsl) {
        this.hsl = hsl;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public String getNgayvaolam() {
        return ngayvaolam;
    }

    public void setNgayvaolam(String ngayvaolam) {
        this.ngayvaolam = ngayvaolam;
    }

    public String getBophan() {
        return bophan;

    }

    public void setBophan(String bophan) {

        this.bophan = bophan;

    }

    public int getSongayphep() {
        return songayphep;
    }

    public void setSongayphepI(int songayphep) {
        this.songayphep = songayphep;
    }

    public abstract void displayInformation();

    public abstract void displaySalary();

}
