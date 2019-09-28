import java.util.Scanner;

public class DefangIPAddress{
	
	    

		public String defangIPaddr(String address) {
	       StringBuilder newAddress = new StringBuilder();
	        for (int i = 0 ; i < address.length(); i++)
	       {
	           if ( address.charAt(i) == '.')
	           {
	        	   newAddress.append("[.]");
	           }
	            else{
	            	newAddress.append(address.charAt(i));
	            }
	       }
	       System.out.print("Defanged IP address: " + newAddress);
	       return newAddress.toString(); 
	    }
	
	public static void main(String [] args){
		DefangIPAddress sol = new DefangIPAddress();
		System.out.print("Enter a valid IPv4 address.");
        Scanner scanaddress = new Scanner(System.in);
        String address = scanaddress.nextLine();
        // Method 2 in comments:
        //String replaceAdd = address.replace(".","[.]");
        //System.out.print(replaceAdd);
        System.out.print("IP address is " + address+"\n");
        sol.defangIPaddr(address); 
	}
	
};
