package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetExample7 {

	public static void main(String[] args) {
		
		// creating list of list of integer
		
		List<List<Integer>> allList = new ArrayList<>();
		List<Integer> l1 = Arrays.asList(12,23,23);
		List<Integer> l2 = Arrays.asList(43,54,65);
		List<Integer> l3 = Arrays.asList(14,53,64);
		List<Integer> l4 = Arrays.asList(14,53,64);
		
		allList.add(l1);
		allList.add(l2);
		allList.add(l3);
		allList.add(l4);
		
		System.out.println(allList);
		
		System.out.println(l2.get(1));
		
		System.out.println(allList.get(1).get(1));
		
		
		// creating set of set of string
		
		Set<Set<String>> s1 = new HashSet<>();		
	}
}
