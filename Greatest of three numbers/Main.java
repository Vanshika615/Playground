import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here      
      Scanner in = new Scanner(System.in);
      int num1 = in.nextInt();
      int num2 = in.nextInt();
      int num3 = in.nextInt();
      
      if(num1 > num2)
		{
		    // Compare num1 and num3
		    if(num1 > num3)
		    {
		        System.out.print(num1);
		    }
		    else
		    {
		         System.out.print(num3);
		    }
		}
		
		else
		{
		    // Compare num2 and num3
		    if(num2 > num3)
		    {
		       System.out.print(num2); 
		    }
		    else
		    {
		       System.out.print(num3);
            }
        }
    }
}