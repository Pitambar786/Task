package demo.com;

public class PalliandromDemo {
	int result=0;
	public void checkPalliandrome(Integer number) {
		for(int i=0;number>0;i++) {
			int num = number%10;
			number=number/10;
			result=(result*10)+num;
		}
		System.out.println(result);
	}
	public void display(Object s){
		System.out.println("String");
	}
	
public void display(StringBuffer s){
	System.out.println("StringBuffer");
	}
public void display(StringBuilder s){
	System.out.println("StringBuilder");
}
	public static void main(String[] args) {
		String ftr = null;
		System.out.println("abc".equals(ftr));
		PalliandromDemo p = new PalliandromDemo();
		StringBuffer  s=new StringBuffer();
		p.checkPalliandrome(121);
	}

}
