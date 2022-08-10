import java.util.Scanner;
class factoral
{
    public static void main(String[] args)
    {
        int no, f = 1, temp;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        no = sc.nextInt();
        temp = no;
        while(temp>0)
        {
            f = f*temp;
            temp--;
        }
        System.out.println("Factorial of "+no+" is "+f);
    
    }
}