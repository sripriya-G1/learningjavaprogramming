package javaprogram;
import java.util.Scanner;
public class methodoverloadingcalculator {

	public static void main(String[] args) {
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter the number in between 1 to 4: ");
				int num=scan.nextInt();
				switch(num)
				{
				case 1:
					calculate(10,44.00);
					break;
				case 2:
					calculate(10,20);
					break;
				case 3:
					calculate(55.77,67);
					break;
				case 4:
					calculate(70,78.8);
					break;
					
					}
			}
			public static void calculate(int a,double b)
			{
				System.out.println("addition is "+(a+b));
			}
				public static void calculate(int a,int b)
				{
					System.out.println("Substraction is"+(a-b));
				}
				public static void calculate(double a,int b)
				{
					System.out.println("Substraction is"+(a*b));
				}
				public static void calculate(int a,float b)
				{
					System.out.println("Substraction is"+(a/b));
				}

			
	}

