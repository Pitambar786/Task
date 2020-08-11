package demo.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> copy=new ArrayList<String>();
		int [] arr= {1,2,3,4};
		int y=0;
		while(y--<10) {
			continue;
		}
		String message=y>10?"greater then":"less then";
		System.out.println(message+"10");
	}
	
	
	

}
