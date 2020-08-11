package demo.com;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> pred = i->i>10;
		System.out.println(pred.test(10));
		System.out.println(pred.test(11));

	}

}
