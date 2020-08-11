package demo.com;

import java.util.function.Predicate;

public class PredicateJoining {
	//there are few default methods in Predicate class to join multiple boolean valued expresion using and or and negate function.
	public static void main(String args[ ]) {
		int arr[] = {5,6,8,9,1,2,11,12};
		//demonstrate predicate
		String[] names={"Sunny","Kajal","Mallika","Katrina","Kareena"};
		Predicate<String> nameStartsWithK = name1->name1.startsWith("K");
		for(String name : names) {
			if(nameStartsWithK.test(name)) {
				System.out.println(name);
			}
		}
		//demonstrate predicate joining
		Predicate<Integer> p = i->i>10;
		Predicate<Integer> p1 = i->i%2==0;
		System.out.println("numbers greater then 10:");
		check(p,arr);
		System.out.println("numbers greater then 10:");
		check(p.negate(),arr);
		System.out.println("numbers greater then 10 or even number:");
		check(p.or(p1),arr);
	}
	public static void check(Predicate<Integer> p,int[] arr) {
		for(int a:arr) {
			if(p.test(a)){
				System.out.println(a);
			}
		}
	}

}
