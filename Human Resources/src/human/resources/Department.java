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
public class Department {

    private String mabp;
    private String tenbp;
    private int sonhanvien;

    public Department() {
    }

    public Department(String mabp, String tenbp, int sonhanvien) {
        this.mabp = mabp;
        this.tenbp = tenbp;
        this.sonhanvien = sonhanvien;
    }

    public void inputDepart(ArrayList<Department> arrayListDepartments) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma bo phan: ");
        while (true) {
            mabp = sc.nextLine();
            boolean isFind = false;
            for (int i = 0; i < arrayListDepartments.size(); i++) {
                if (arrayListDepartments.get(i).getMabp().equalsIgnoreCase(mabp)) {
                    isFind = true;
                }
            }
            if (!isFind) {
                break;
            } else {
                System.out.println("MA bo phan da ton tai");
            }

        }

        System.out.println("Nhap ten bo phan: ");

        while (true) {
            tenbp = sc.nextLine();
            boolean isFind1 = false;
            for (int i = 0; i < arrayListDepartments.size(); i++) {
                if (arrayListDepartments.get(i).getTenbp().equalsIgnoreCase(tenbp)) {
                    isFind1 = true;
                }
            }
            if (!isFind1) {
                break;
            } else {
                System.out.println("Ten bo phan da ton tai.");
            }

        }
        System.out.println("Nhap so nhan vien: ");
        sonhanvien = sc.nextInt();
    }

    public String getMabp() {
        return mabp;
    }

    public void setMabp(String mabp) {
        this.mabp = mabp;
    }

    public String getTenbp() {
        return tenbp;
    }

    public void setTenbp(String tenbp) {
        this.tenbp = tenbp;
    }

    public int getSonhanvien() {
        return sonhanvien;
    }

    public void setSonhanvien(int sonhanvien) {
        this.sonhanvien = sonhanvien;
    }

    @Override
    public String toString() {
        return "Department{" + "mabp=" + mabp + ", tenbp=" + tenbp + ", sonhanvien=" + sonhanvien + '}';
    }

    public void displaydepartment() {
        System.out.printf("%20s %30s %5d\n", mabp, tenbp, sonhanvien);
    }

    public void ShowDepart() {
        System.out.printf("%20s %30s \n", mabp, tenbp);
    }

}
