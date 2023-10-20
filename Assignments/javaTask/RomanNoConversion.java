package javaTask;
import java.util.*;

public class RomanNoConversion {
public static void RomantToInt(String str) {
	HashMap<Character,Integer> map = new HashMap<Character, Integer>();
	map.put('I', 1);
	map.put('V', 5);
	map.put('X', 10);
	map.put('L', 50);
	map.put('C', 100);
	map.put('D', 500);
	map.put('M', 1000);
	
	int ans  = 0;
	int ind = str.length();
	for(int i =0; i <ind;i++) {
		if(i < ind-1 && map.get(str.charAt(i)) < map.get(str.charAt(i+1)) ) {
			ans-=map.get(str.charAt(i));
		}else {
			ans += map.get(str.charAt(i));
		}
	}
	System.out.println(str + " = "+ans);
	
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Roman No");
		String str = sc.nextLine();
		RomantToInt(str);
	}

}
