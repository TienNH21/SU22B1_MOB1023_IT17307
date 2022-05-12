package buoi2_interface;

public class Dog implements Animal {
    @Override
    public void an()
    {
        System.out.println("Cơm");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Gâu gâu...");
    }
}
