import java.util.Scanner; 
class SumofTenNumbers 
{  
public static void main(String[] args)  
{  
    int no, j = 0;
    for(int i=1;i<=10;i++)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        no = sc.nextInt();
        j = no + j;
    }
    System.out.println("The sum of ten nummbers is "+j);  
}  
}