package com.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(2);
		arrayList.add(3);
		arrayList.add(6);
		arrayList.add(7);
		arrayList.add(8);
		arrayList.add(9);
		
		//Filter the colection by even number
		List<Integer> evenList=arrayList.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(evenList);
		List<Integer> mulBy2 = evenList.stream().map(x->x*2).collect(Collectors.toList());
		System.out.println(mulBy2);
	}

}
