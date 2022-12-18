package practice2;

public class Reverse16String {

	public static void main(String[] args) {
	
		String str = "India is my country";
		
		String revstr="";
		
				for(int i=str.length()-1;i>=0;i--) {
					
					revstr=revstr+str.charAt(i);
					
					
				}
				System.out.println(revstr);
			}
				
		}

	

//16. Reverse given string str = "India is my country"
