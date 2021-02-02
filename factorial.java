import java.util.Scanner;
public class Main{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        int i;
        int fact=1;
        System.out.println("Enter the number whose factorial to be find");
        int num=obj.nextInt();
        for(i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
