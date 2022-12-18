package practice2;

import java.util.*;

public class PdfPractice {
//ocuu
	public static void main(String[] args) {
		
		
		String st="Welcome to Germany";
		          
		char[] st1 = st.toCharArray();
		         //121121 1111
		
		for(int i=0;i<st1.length;i++) {
			int count=0;
			for(int j=i+1;j<st1.length;j++) {
				
				if(st1[j]==st1[i]) {
					
					
					count++;
					
					st1[j]=' ';
				}
				
				
			}
			if(st1[i]!=' ' && count>=0)
			System.out.println("count of "+st1[i]+(count+1));
			
		}
		
		
		}
	}


