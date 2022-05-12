package buoi2_interface;

public class Cat implements Animal {
    @Override
    public void an()
    {
        System.out.println("Cơm, cá, gà");
    }
    
    @Override
    public void diChuyen()
    {
        System.out.println("Chạy, nhảy");
    }
    
    @Override
    public void tiengKeu()
    {
        System.out.println("Meow");
    }
}
