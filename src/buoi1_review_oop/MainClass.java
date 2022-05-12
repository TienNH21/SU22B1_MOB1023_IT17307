package buoi1_review_oop;

public class MainClass {
    public static void main(String[] args) {
        NhanVien gv = new GiangVien(
            "Ng Van A", "PH1", 30, "UDPM"
        );

        System.out.println(gv.xuatThongTin());
    }
}
