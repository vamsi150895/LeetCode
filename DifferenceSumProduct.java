import java.util.Scanner;


public class DifferenceSumProduct {

	int countSum(int num){
		int sum=0,rem;
		while(num != 0){
			rem = num%10;
			sum = sum +rem;
			num = num /10;
		}
		return sum;
	}
	
	int countProduct(int num){
		int pro=1,rem;
		while(num != 0){
			rem = num%10;
			pro = pro *rem;
			num = num /10;
		}
		return pro;
	}
	public int findDifference(int num) {
		int result = 0;
		result = countProduct(num) - countSum(num);
		System.out.print(result);
		return result;
	}

	public static void main(String[] args) {
		DifferenceSumProduct diff = new DifferenceSumProduct();
		System.out.print("Enter a number: ");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.nextLine());
		diff.findDifference(num);
		scan.close();
	}
}