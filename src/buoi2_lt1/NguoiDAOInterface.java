package buoi2_lt1;

import java.util.ArrayList;

public interface NguoiDAOInterface {
    public void insert(Nguoi n);
    public void update(Nguoi n, int i);
    public void delete(int i);
    public ArrayList<Nguoi> getList();
    public Nguoi getById(int i);
}
