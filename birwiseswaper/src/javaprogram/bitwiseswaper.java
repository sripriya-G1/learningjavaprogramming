package javaprogram;
import java.util.Scanner;
public class bitwiseswaper {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				
				System.out.println("Enter the First Number ");
				int a=scan.nextInt();
				System.out.println("Enter the Second Integer");
				int b=scan.nextInt();
				swapUsingBitwise(a,b);
				
			}
			public static void swapUsingBitwise(int x,int y)
			{
				System.out.println("Before swapping");      
				System.out.println("x= " + x + ", y= " + y);  
				x = x ^ y;  
				y = x ^ y;  
				x = x ^ y;  
				System.out.println("After swapping");  
				System.out.println("Fist= " + x + ", Second= " + y);  
						
				
			}

		
	}

