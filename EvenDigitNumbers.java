import java.util.Scanner;


public class EvenDigitNumbers {

	int countDigits(int num){
		int count=0;
		while(num != 0){
			count = count +1;
			num = num/10;
		}
		return count;
	}

	public int findNumbers(int[] nums, int limit) {
		int count=0;
		int [] digitArray = new int [limit] ;
		for(int i=0; i<nums.length;i++){
			digitArray[i] = countDigits(nums[i]);
		}
		for(int i=0; i<digitArray.length;i++){
			if(digitArray[i] % 2 == 0){
				count = count + 1 ;
			}
		}
		System.out.print(count);
		return count;
	}

	public static void main(String[] args) {
		EvenDigitNumbers obj1 = new EvenDigitNumbers();
		System.out.print("Enter limit on number of numbers: ");
		Scanner scan = new Scanner(System.in);
		int limit = Integer.parseInt(scan.nextLine());

		int arrayOfNumbers[] = new int[limit];
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print("Enter the number: " + (i+1) + " : ");
			arrayOfNumbers[i] = Integer.parseInt(scan.nextLine());
		}
	/*	System.out.print("Given numbers: \n");
		for (int i = 0; i < arrayOfNumbers.length; i++) {
			System.out.print( arrayOfNumbers[i]+"\n");
		}	
*/
		obj1.findNumbers(arrayOfNumbers,limit);
		scan.close();
	}
}