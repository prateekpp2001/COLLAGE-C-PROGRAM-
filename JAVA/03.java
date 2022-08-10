class DisplayevenNumbersExample1  
{  
public static void main(String args[])   
{  
int number=50;  
System.out.print("List of even numbers from 30 to "+number+": ");  
for (int i=30; i<=number; i++)   
{  
//logic to check if the number is odd or not  
//if i%2 is not equal to zero, the number is odd  
if (i%2==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}