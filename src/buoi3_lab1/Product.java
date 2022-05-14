package buoi3_lab1;

public class Product {
    private String ten;
    private double gia;

    public Product() {
    }

    public Product(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public String getTen() {
        return ten;
    }

    public double getGia() {
        return gia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    
    public double getImportTax()
    {
        return this.gia * 0.1;
    }
}
