package demo.com;

import java.util.Scanner;

public class BubbleSort {

	
	public void bubbleSort() {
		System.out.println("enter elemnets of array");
		Scanner sc= new Scanner(System.in);
		Integer array[] = new Integer[5];
		for(int i=0;i<5;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("inserted elements in array:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
		int temp=0;
		for(int i=0;i<array.length;i++) {
			
			for(int j=0;j<(array.length)-i-1;j++) {
				if(array[j]<array[j+1]) {
					temp=array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
		
		System.out.println("sorted array :");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort sort= new BubbleSort();
		
		sort.bubbleSort();
	}

}
