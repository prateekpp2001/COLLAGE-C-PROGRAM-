import java.util.Scanner;
class areaofrectangle
{
    public static void main (String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length :");
        double length =sc.nextDouble();
        System.out.println("Enter the breath :");
        double breath =sc.nextDouble();
        double area=length*breath;
        System.out.println("Area of the rectangle :"+area);
    }
}  
 