package buoi1_review_oop;

public class GiangVien extends NhanVien {
    private String chuyenNganh;

    public GiangVien() {
    }
    
    public GiangVien(String ten, String ma,
        int tuoi, String chuyenNganh) {
        super(ten, ma, tuoi);
        this.chuyenNganh = chuyenNganh;
    }
    
    @Override
    public String xuatThongTin() {
        return super.xuatThongTin() +
            " - " + this.chuyenNganh;
    }
}
