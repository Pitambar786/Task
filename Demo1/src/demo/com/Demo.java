package demo.com;

import java.util.ArrayList;

class DemoTest{
int a=0;
	public void display() {
		a=10;
		// TODO Auto-generated method stub
		System.out.println("Hello world"+a);

	}

}
public class Demo extends DemoTest{
	int a=20;
	public void display() {
		System.out.println("hellow hihihi"+a);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");
		DemoTest test = new Demo();
		test.display();
		System.out.println(test.a);
		ArrayList al =  new ArrayList();
		al.contains(1);
		int x=24;
		int y = x>>2;
		y=y<<4;
		System.out.println(y);
		
			Trick t=null;

			t.m1();

	}
}

class Trick {
static void m1(){
System.out.println("hello");

}

}

