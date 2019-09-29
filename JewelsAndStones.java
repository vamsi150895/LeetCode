public class JewelsAndStones{

	public int stonesInJewel(String stone, String jewel){
		int count =0;
		for (int i = 0 ; i < stone.length(); i++)
		{
			for (int j=0 ; j < jewel.length(); j++)
			{
				if(stone.charAt(i) == jewel.charAt(j)){
					count = count + 1;
				}
			}
		}
		System.out.print(count);
		return count;
	}

	public static void main(String [] args){
		String stone = "aA";
		String jewel = "aAAbbbB";
		JewelsAndStones countStones = new JewelsAndStones();
		countStones.stonesInJewel(stone, jewel);

	}

}
