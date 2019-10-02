// Think What to do 
// for negative numbers
import java.util.HashSet;
import java.util.Set;

public class UniqueOccurances {

	public boolean uniqueOccurrences(int[] arr) {
		int [] countOccurances = new int[100] ;
		int temp;
		Set<Integer> uniqueOcc = new HashSet<>();
		for(int i = 0; i < arr.length; i++)
		{
			temp = arr[i];
			countOccurances[temp]++;
		}

		for (int k =0 ; k< countOccurances.length; k++)
		{
			if (countOccurances[k] > 0) {System.out.print(countOccurances[k]+ " ");}
		}
		for (int number : countOccurances)
		{
			if (number != 0 && uniqueOcc.add(number) == false)
			{
				System.out.print("\nOccurances repeat!");
				return false;
			}
		}
		System.out.print("\nOccurances are unique.");
		return true ;

	}
	public static void main(String[] args) {

		int [] arr = {1,2,2,1,1,3,6,6,6,6};
		UniqueOccurances matchOccurances = new UniqueOccurances();
		matchOccurances.uniqueOccurrences(arr);
	}

}
