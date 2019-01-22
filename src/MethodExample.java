import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) 
	{
		/**
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		greeting(name);
		
		System.out.println(sumThree(1,2,3));
		Scanner input = new Scanner (System.in);
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3= input.nextDouble();
		double num4 = input.nextDouble();
		System.out.println(averageofFour(num1,num2,num3,num4));
		*/
		Scanner input = new Scanner (System.in);
		System.out.println("Input number: ");
		double nums1 = input.nextInt();
		System.out.println("Input number: ");
		double nums2 = input.nextInt();
		System.out.println("Input number: ");
		double nums3 = input.nextInt();
		System.out.println("Input number: ");
		double nums4 = input.nextInt();
		averageofFour(nums1, nums2, nums3, nums4);
		System.out.println("The average is " + averageofFour(nums1,nums2,nums3,nums4));
		
	}
	/***
	public static void greeting(String arg1)
	{	// arg1 = "Everyone"
		// no connection between variable in parameter of this method with one in main
		System.out.print("Hello, " + arg1);
	}
	public static int sumThree(int int1, int int2, int int3)
	{
		int sum = int1 + int2 + int3;
		return sum;
	}
	*/
	public static double averageofFour(double num1, double num2, double num3, double num4)
	{
		double average = (num1 + num2 + num3 + num4)/4;
		return average;
	}
	/***
	public static int smallThree(int number1, int number2, int number3) {
		int min = 0;
		if (number1 < number2 && number1 < number3)
		{
			min = number1;
		}
		else if (number2 < number1 && number2 < number3)
		{
			min = number2;
		}
		else
		{
			min = number3;
		}
		return min;
		
	}
	*/
}
