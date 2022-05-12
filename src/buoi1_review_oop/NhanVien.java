package buoi1_review_oop;

public class NhanVien {
    private String ten;
    private String ma;
    private int tuoi;

    public NhanVien(String ten, String ma, int tuoi) {
        this.ten = ten;
        this.ma = ma;
        this.tuoi = tuoi;
    }

    public NhanVien() {
    }
    
    public String xuatThongTin() {
        return this.ten + " - " + this.ma + " - "
            + this.tuoi;
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
}
