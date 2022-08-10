import java.util.Scanner;
class Multiplication_table 
{
    public static void main(String[] args)
    {
        int no,j;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
             j = i * no;
            System.out.println(no+" x "+i+" = "+j);
        }
    }
}