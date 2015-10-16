package com.leviblog.common.util;

import java.util.ArrayList;

public class ExceptionStack {
	
	private  static ArrayList<String> exceptionStack = new ArrayList<String>();

	public static void put(String s){
		exceptionStack.add(s);
	}
    
	public static ArrayList<String> get(){
		return exceptionStack;
	}
	
	
}
