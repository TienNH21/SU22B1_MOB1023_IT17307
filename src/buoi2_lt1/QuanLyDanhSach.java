package buoi2_lt1;

import java.util.ArrayList;

public class QuanLyDanhSach implements NguoiDAOInterface {
    private ArrayList<Nguoi> ds;
    
    public QuanLyDanhSach() {
        this.ds = new ArrayList<Nguoi>();
    }

    @Override
    public void insert(Nguoi n) {
        this.ds.add(n);
    }

    @Override
    public void update(Nguoi n, int i) {
        this.ds.set(i, n);
    }

    @Override
    public void delete(int i) {
        this.ds.remove(i);
    }

    @Override
    public ArrayList<Nguoi> getList() {
        return this.ds;
    }

    @Override
    public Nguoi getById(int i) {
        return this.ds.get(i);
    }
}
