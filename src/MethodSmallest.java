import java.util.Scanner;

public class MethodSmallest {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number");
		int nums1 = input.nextInt();
		System.out.println("Enter a number");
		int nums2 = input.nextInt();
		System.out.println("Enter a number");
		int nums3 = input.nextInt();
		smallThree(nums1, nums2, nums3);
		System.out.println("The smallest of the three numbers is " + smallThree(nums1,nums2,nums3));

	}
	public static int smallThree(int number1, int number2, int number3) {
		
		/**int min = 0;
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
		*/
		return Math.min(Math.min(number1, number2), number3);
	}
}
	
