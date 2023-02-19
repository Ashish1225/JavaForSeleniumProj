package testPack;

import java.util.LinkedHashSet;

//remove duplicate character
public class DuplicateCharacter {

	public static void main(String[] args) {
		String str = "Google";
		LinkedHashSet<Character> lhs=new LinkedHashSet<>();
		
		for(int i=0;i<str.length();i++) {
			lhs.add(str.charAt(i));
		}
		
		System.out.println(lhs);
		
		for(Character ch:lhs) {
			System.out.print(ch);
		}

	}

}
