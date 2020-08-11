package com.streams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ThreadA {
	public void display(){
	ArrayList list = new ArrayList();
	list.stream().filter(i->i%2==0).collect(Collectors.toList());
	}

}

