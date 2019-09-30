
import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones{
	private static int numJewelsInStones(String stones, String jewels) {
		Set<Character> jeweltype = new HashSet<>();
		for (char ch : jewels.toCharArray()) {
			jeweltype.add(ch);
		}
		System.out.println(jewels.toCharArray());
		int count = 0;
		for (char c : stones.toCharArray()) {
			if (jeweltype.contains(c)) {
				count++;
			}
		}
		System.out.print(count);
		return count;
	}

	public static void main(String[] args) {
		JewelsAndStones jewelCounter = new JewelsAndStones();
		jewelCounter.numJewelsInStones("aAAbdB", "aA");
	}
}