/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package human.resources;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 2
 * 2
 *
 * @author Administrator
 */
public class HumanResources {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Staff> arrayListeEmployees = new ArrayList<>();
    //ArrayList<Manager> arrayListManager = new ArrayList<>();
    static ArrayList<Department> arrayListDepartments = new ArrayList<>();
    static ArrayList<Staff> Salary = new ArrayList<>();

    public static void exampleElementOfList() {
        Department d1 = new Department("BPSX", "San xuat", 2);
        Department d2 = new Department("BPHC", "Hanh chinh", 2);
        Department d3 = new Department("BPCL", "Chat luong", 2);
        arrayListDepartments.add(d1);
        arrayListDepartments.add(d2);
        arrayListDepartments.add(d3);
        Staff s1 = new Manager("01", "A", 21, 2, "1/1/2001", "Hanh chinh", 12, 5000000);
        Staff s2 = new Manager("02", "B", 21, 2, "1/1/2001", "San xuat", 12, 6000000);
        Staff s4 = new Employee("04", "D", 21, 2, "1/1/2001", "Hanh chinh", 12, 35);
        Staff s5 = new Manager("05", "E", 21, 2, "1/1/2001", "San xuat", 12, 8000000);
        Staff s3 = new Employee("03", "C", 21, 2, "1/1/2001", "San xuat", 12, 40);
        arrayListeEmployees.add(s1);
        arrayListeEmployees.add(s2);
        arrayListeEmployees.add(s3);
        arrayListeEmployees.add(s4);
        arrayListeEmployees.add(s5);

    }

    public static void funcTion() {
        int choose;
        Scanner sc = new Scanner(System.in);
        do {
            Showmenu();
            System.out.println("Choose: ");
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 1:
                    System.out.printf("%5s %20s %5s %5s %15s %10s %5s %12s %10s %12s \n", "MÃ NV", "Tên NV", "Tuổi",
                            "HSL", "Ngay vao lam", "Bộ phận", "Số phép", "Staff Type", "Chức vụ", "Giờ OVT");
                    for (int i = 0; i < arrayListeEmployees.size(); i++) {

                        arrayListeEmployees.get(i).displayInformation();

                    }

                    break;
                case 2:
                    System.out.println("Lựa chọn thêm bo phan");
                    System.out.println("1.Thêm bộ phận mới");
                    System.out.println("2.Hiển thị bộ phận");
                    int chon = Integer.parseInt(sc.nextLine());
                    int n;
                    if (chon == 1) {
                        System.out.println("Nhap so bo phan");
                        n = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < n; i++) {
                            Department oDepartment = new Department();
                            oDepartment.inputDepart(arrayListDepartments);
                            arrayListDepartments.add(oDepartment);
                        }
                    }
                    if (chon == 2) {
                        System.out.printf("%20s %30s \n", "Mã Bộ Phận", "Tên Bộ Phận");
                        for (int i = 0; i < arrayListDepartments.size(); i++) {
                            //Department d =new Department();

                            arrayListDepartments.get(i).ShowDepart();

                        }
                    }
                    break;
                case 3:
                    System.out.println("Hiển thị nhân viên theo phòng ban!");
                    for (int i = 0; i < arrayListDepartments.size(); i++) {
                        for (int j = 0; j < arrayListeEmployees.size(); j++) {
                            if (arrayListDepartments.get(i).getTenbp()
                                    .equalsIgnoreCase(arrayListeEmployees.get(j).getBophan())) {
                                //Employee o = new Employee();

                                arrayListeEmployees.get(j).displayInformation();
                            }

                        }

                    }

                    break;

                case 4:
                    System.out.println("Lựa chọn thêm nhân viên");
                    System.out.println("1.Employee");
                    System.out.println("2.Manager");
                    int selection = Integer.parseInt(sc.nextLine());

                    if (selection == 1) {
                        int a;
                        System.out.println("Nhap so nhan vien can them ");
                        a = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < a; i++) {
                            Employee o = new Employee();
                            o.inputinfo(arrayListDepartments);
                            arrayListeEmployees.add(o);
                        }
                    }

                    if (selection == 2) {
                        int b;
                        System.out.println("Nhap so quan ly can them ");
                        b = Integer.parseInt(sc.nextLine());
                        for (int i = 0; i < b; i++) {
                            Manager o = new Manager();
                            o.inputinfo(arrayListDepartments);
                            System.out.println("Chọn số tương ứng với chức vụ của quản lý.");
                            System.out.println("1.Business Leader");
                            System.out.println("2.Project Leader");
                            System.out.println("3.Technical Leader");
                            selectPossition(o);
                            arrayListeEmployees.add(o);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Nhập mã nhân viên hoặc tên nhân viên cần tìm kiếm");
                    sc = new Scanner(System.in);
                    String key = sc.nextLine();
                    boolean search = false;
                    for (int i = 0; i < arrayListeEmployees.size(); i++) {
                        if (key.equalsIgnoreCase(arrayListeEmployees.get(i).getManv())
                                || key.equalsIgnoreCase(arrayListeEmployees.get(i).getTennv())) {
                            search = true;
                            System.out.printf("%5s %20s %5s %5s %15s %10s %5s %12s %10s %12s \n", "MÃ NV", "Tên NV", "Tuổi",
                                    "HSL", "Ngay vao lam", "Bộ phận", "Số phép", "Staff Type", "Chức vụ", "Giờ OVT");
                            arrayListeEmployees.get(i).displayInformation();

                        }

                    }

                    if (search == false) {
                        System.out.println("Không có kết quả");
                    }

                    break;
                case 6:
                    tinhLuong();
                    sapXepGiamDanTheoLuong();
                    break;
                case 7:
                    tinhLuong();
                    sapXepTangDanTheoLuong();
                    break;
                case 8:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Nhap sai");
                    break;

            }

        } while (choose != 8);
    }

    public static void tinhLuong() {
        double salary = 0;
        for (Staff i : arrayListeEmployees) {
            // i.displaySalary();
            if (i instanceof Manager) {
                salary = ((Manager) i).calculateSalary();
                i.setLuong(salary);
                Salary.add(i);
            } else if (i instanceof Employee) {
                salary = ((Employee) i).calculateSalary();
                i.setLuong(salary);
                Salary.add(i);

            }

        }
    }

    public static void sapXepTangDanTheoLuong() {
        Collections.sort(Salary, new Comparator<Staff>() {

            @Override
            public int compare(Staff o1, Staff o2) {
                return (int) (o1.getLuong() - o2.getLuong());
            }
        });
        System.out.println("Bang luong sau khi sap xep");

        System.out.printf("%5s %20s  %5s %5s %10s  %5s  %5s\n",
                "Mã NV", "Tên NV", "HSL", "Ngày vào làm", "Bộ Phận", "OVT(chức vụ)", "Tiền Lương");
        for (Staff staff : Salary) {
            staff.displaySalary();
        }
    }

    public static void sapXepGiamDanTheoLuong() {
        Collections.sort(Salary, new Comparator<Staff>() {

            @Override
            public int compare(Staff o1, Staff o2) {
                return (int) (o2.getLuong() - o1.getLuong());
            }
        });
        System.out.println("Bang luong nhan vien giam dan");

        System.out.printf("%5s %20s  %5s %5s %10s  %5s  %5s\n",
                "Mã NV", "Tên NV", "HSL", "Ngày vào làm", "Bộ Phận", "OVT(chức vụ)", "Tiền Lương");
        for (Staff staff : Salary) {
            staff.displaySalary();
        }
    }

    public static void selectPossition(Manager manager) {
        Scanner sc = new Scanner(System.in);
        int po = sc.nextInt();
        int position;
        switch (po) {
            case 1:
                position = 8000000;
                manager.setChucdanh(position);
                break;
            case 2:
                position = 5000000;
                manager.setChucdanh(position);
                break;
            case 3:
                position = 6000000;
                manager.setChucdanh(position);
                break;
            default:
                System.out.println("Wrong format, please re-enter");
                selectPossition(manager);
        }
    }

    static void Showmenu() {
        System.out.println("1. Hiển thị danh sách nhân viên hiện có trong công ty");
        System.out.println("2. Hiển thị các bộ phận trong công ty");
        System.out.println("3. Hiển thị các nhân viên theo từng bộ phận");
        System.out.println("4. Thêm nhân viên mới vào công ty");
        System.out.println("5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên");
        System.out.println("6. Hiển thị bảng lương của nhân viên toàn công ty");
        System.out.println("7. Hiển thị bảng lương của nhân viên theo thứ tự tăng dần");
        System.out.println("8. Thoát");
    }

    public static void main(String[] args) {
        exampleElementOfList();
        funcTion();

    }
}
