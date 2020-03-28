package Easy;

import java.util.HashSet;
import java.util.Set;

public class PalindromePermutation {

	public static void main(String[] args) {
		boolean y=canPermutePalindrome("");
	}
	
	public static boolean canPermutePalindrome(String s)
	{
		Set<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++)
		{
			if(!set.add(s.charAt(i)))
				set.remove(s.charAt(i));
		}
		return set.size()<=1;
	}
}
