package javaprogramm;
import java.util.Scanner;
public class thecalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a two number");
		int num=scan.nextInt();
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		switch(num)
		{
		case 1:
			int res=num1+num2;
			System.out.println("Addition is"+res);
			break;
		case 2:
			int res2=num1*num2;
			System.out.println("Multiplication is "+" "+ res2);
			break;
		case 3:
			int res3=num1-num2;
			System.out.println(" Substration is "+" "+res3);
			break;
		case 4:
			int res4=num1/num2;
			System.out.println("Division is"+" "+res4);
			break;
		default:
			System.err.println("Idiot....Go to Vasan Eye Care");
		}
		

}
}