class One
{
    void show()
    {
        System.out.println("Hello first");
    }
}
class Two extends One
{
    void show()
    {
        System.out.println("Hello second");
    }
}
class Three extends One
{
    void show()
    {
        System.out.println("Hello third");
    }
}
public class Main
{
    public static void main(String args[])
    {
        One obj1=new One();
        obj1.show();//Normal calling
        
        One obj=new Two();//Run time polymorphsism
        obj.show();
        
        obj=new Three();//Dynamic method dispatch concept.
        obj.show();
    }
}
