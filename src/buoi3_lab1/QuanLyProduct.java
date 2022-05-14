package buoi3_lab1;

import java.util.ArrayList;

public class QuanLyProduct implements ProductDAOInterface {

    private ArrayList<Product> ds;
    
    public QuanLyProduct()
    {
        this.ds = new ArrayList<Product>();
    }
    
    @Override
    public void insert(Product p) {
        this.ds.add(p);
    }

    @Override
    public void update(int viTri, Product p) {
        this.ds.set(viTri, p);
    }

    @Override
    public void delete(int viTri) {
        this.ds.remove(viTri);
    }

    @Override
    public ArrayList<Product> getList() {
        return this.ds;
    }

    @Override
    public Product getById(int viTri) {
        return this.ds.get(viTri);
    }
    
}
