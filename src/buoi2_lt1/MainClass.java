package buoi2_lt1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        NguoiDAOInterface qlds = new QuanLyDanhSach();
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            MainClass.menu();
            int chon = Integer.parseInt( sc.nextLine() );
            if (chon == 0) {
                break;
            }
            
            switch (chon) {
                case 1:
                    System.out.println("Nhập họ tên:");
                    String hoTen = sc.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String diaChi = sc.nextLine();
                    System.out.println("Nhập giới tính(1-Nam,0-Nữ):");
                    int gioiTinh = Integer.parseInt(sc.nextLine());
                    
                    Nguoi n = new Nguoi(hoTen, gioiTinh, diaChi);
                    qlds.insert(n);
                    break;
                case 2:
                    ArrayList<Nguoi> ds = qlds.getList();
                    for (Nguoi n1: ds) {
                        System.out.println(n1.xuatThongTin());
                    }
                    
                    break;
                case 3:
                    SinhVien sv = new SinhVien("PH1", "UDPM", "Ng Van A", 1, "HN");
                    System.out.println(sv.xuatThongTin());
                    qlds.insert(sv);
                    break;
            }
        }
    }
    
    public static void menu() {
        System.out.println("-------------------");
        System.out.println("Nhập:");
        System.out.println("\t1. Thêm mới");
        System.out.println("\t2. Xuất danh sách");
        System.out.println("\t3. Sinh viên");
        System.out.println("\t0. Dừng chương trình");
        System.out.println("-------------------");
    }
}
