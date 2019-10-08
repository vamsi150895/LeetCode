
public class RemoveOuterParantheses {

	public String removeOutBrackets(String parantheses){
		StringBuilder newbrackets = new StringBuilder();
		int openBrac = 0, closedBrac =0, count = 0;
		for(int i=0; i < parantheses.toCharArray().length; i++){
			if(parantheses.charAt(i) == '('){
				openBrac++;
			}
			else if(parantheses.charAt(i) == ')')
				closedBrac++;

			if (openBrac == closedBrac){
				newbrackets.append(parantheses.substring(count + 1, i));
				count = i+1;
			}
		}
		System.out.print(newbrackets);
		return newbrackets.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String brackets = "(()())(())";
		RemoveOuterParantheses obj = new RemoveOuterParantheses();
		obj.removeOutBrackets(brackets);
	}

}
