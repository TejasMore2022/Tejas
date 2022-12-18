package practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _20SortStringUsingCollections {

//	21. sort given string  b) using collection	 

	public static void main(String args[])   
	{  
	
		ArrayList<String> obj=new ArrayList<>();
		obj.add("m");
		obj.add("n");
		obj.add("a");
		obj.add("z");
		obj.add("0");
		obj.add("7");
		obj.add("@");
		
		
		System.out.println("data before sorting");
		System.out.println(obj);
		
		Collections.sort(obj);
		System.out.println("data after sorting");
		for(String each:obj) {
			
			System.out.print(each+", ");
		}
		
	}  
	}



//  String st="please";
