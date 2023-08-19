package javaprogramm;
import java.util.Scanner;
public class temperaturecalculation {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Welcome to the Temperature Conversion Tool");
			System.out.println("Select an option:");
			System.out.println("1. Convert Celsius to Fahrenheit");
			System.out.println("2. Convert Fahrenheit to Celsius");
			System.out.println("Enter your choice :");
			int num2=scan.nextInt();
			
			switch(num2)
			{
			case 1:
				System.out.println("Enter The temperature in celsius");
				double num=scan.nextDouble();
				double res=celsiusToFahrenheit(num);
				System.out.println(num +" C is equivalent to "+ res +"F");
				break;
			case 2:
				System.out.println("Enter The temperature in Faherenheit");
				double num1=scan.nextDouble();
				double res1= fahrenheitToCelsius(num1);
				System.out.println(num1 +" C is equivalent to "+ res1 +"F");
				break;
			}
		}
		
		public static double celsiusToFahrenheit(double C)
		{
			return (C * 9/5) + 3;
		}
		
		public static double fahrenheitToCelsius(double F)
		{
			return (F - 32) *5/9;
			
		
	
		}
}