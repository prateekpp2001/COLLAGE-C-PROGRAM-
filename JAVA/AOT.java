import java.util.Scanner;
public class AOT
{
    public static void main (String[]args)
    {
        double a,b,c,s,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the value of a,b,c:");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        sc.close();
        if (a+b>c&&a+c>b)
        {
            s=(a+b+c)/2;
            area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("area of a triangle"+area);
        }
        else
        {
            System.out.println("invalid tringle");
        }

    }
}
    




