import java.util.Scanner;
class table
{
    public static void main(String[]args)
    {
        int num,i;
        System.out.println("enter any number");
        try (Scanner r = new Scanner(System.in)) {
            {
                num=r.nextInt();
            }
        }
        for(i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }

    }
}
    

