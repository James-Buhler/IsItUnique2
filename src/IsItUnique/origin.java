package IsItUnique;

public class origin {

	public static void main(String[] args) {
		
		//Creating sample strings
		String str = "Abcdefghijklmnopqrstuvwxyz";
		String str2 = "I want an Apple";
		String str3 = "slept";
		String str4 = "strict";
		//running function with sample strings
		System.out.println(IsAllUnique(str));
		System.out.println(IsAllUnique(str2));
		System.out.println(IsAllUnique(str3));
		System.out.println(IsAllUnique(str4));
	}
	//takes in a string 
	//returns false if there are any non-space characters that have duplicates ignoring case
	//returns true if all non-space characters are unique ignoring case
	public static boolean IsAllUnique(String str)
	{
		for(int i = 0; i< str.length(); i++) {
			for(int j = 1 + i; j < str.length(); j++) {
				if(str.charAt(i) != ' ') {
					if(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) {
						return false;
					}
				}
			}
		}
		return true;
	}	
}
