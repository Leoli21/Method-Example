import java.util.Scanner;

public class MethodExample {

	public static void main(String[] args) 
	{
		/**
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		greeting(name);
		*/
		System.out.println(sumThree(1,2,3));
	}
	
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
}
