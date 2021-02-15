class One
{
    int a,b;
    One()
    {
        a=10;
        b=30;
    }
    One(int p)
    {
        a=p;
        b=p;
    }
    One(int q,int r)
    {
        a=q;
        b=r;
    }
    void show()
    {
        System.out.println("The value of A:"+" "+a+"B:"+" "+b);
    }
}
class Two extends One
{
    int c,d;
    Two()
    {
        c=30;
        d=50;
    }
    Two(int p)
    {
        super(p);
        c=p;
        d=p;
    }
    Two(int q,int r)
    {
        super(q,r);
        c=q;
        d=r;
    }
    void addz()
    {
        System.out.println(a+b+c+d);
    }
}
public class Main{
    public static void main(String args[])
    {
        //Two obj=new Two();
        //obj.show();
        //obj.addz();
        //Two obj1=new Two(90);
        //obj1.show();
        //obj1.addz();
        Two obj2=new Two(80,70);
        obj2.show();
        obj2.addz();
    }
}
