package javaTask;
import java.util.*;

public class Pangram {
	
	public static boolean CheckPangram(String s) {
		HashSet<Character>set = new HashSet<Character>();
		if(s.length()<26) {
			return false;
		}
		
		String str = s.toLowerCase();
		int count = 0;
		
		for(char c : str.toCharArray()) {
			if(set.add(c) &&  Character.isLetter(c)) {
				count++;				
			}			
		}
		return count == 26;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String For checking it is pangram or not");
		String s = sc.nextLine();
			
		boolean isPangram = CheckPangram(s);	
		if(isPangram) {
			System.out.println("String is Pangram");
		}else {
			System.out.println("String is Not Pangram");
		}
	}

}
