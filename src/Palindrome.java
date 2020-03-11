
public class Palindrome {
	
	public static void main(String args[])
		{
		    
				String str = "test@gmail.com"; 
				String[] arrOfStr = str.split("[@.]"); 

			//	for (int i=0)
				  String res="";
				for (String a : arrOfStr) 
				  res=res+a +" ";
					System.out.println(res); 
				
		
		}

}
