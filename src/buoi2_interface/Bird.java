package buoi2_interface;

public class Bird implements Animal {
    @Override
    public void an()
    {
        System.out.println("Sâu bọ");
    }

    @Override
    public void diChuyen()
    {
        System.out.println("Bay");
    }

    @Override
    public void tiengKeu()
    {
        System.out.println("Hót");
    }
}
