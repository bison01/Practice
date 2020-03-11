
public class TestReverse { 

	public static void main(String[] args) 
	{ 
		String s[] = "i like this program very much".split(" "); 
		
			
		System.out.println("S length is :"+s.length);
		
		String ans = ""; 
		for (int i = s.length - 1; i >= 0; i--) { 
			ans += s[i] + " "; 
		} 
		System.out.println("Reversed String:"); 
		System.out.println(ans); 
		
		System.out.println("Length of ans"+ans.split(" ").length);
		System.out.println("Answer length is :"+ans.length());
		System.out.println(ans.substring(0, ans.length() - 1)); 
	} 
} 
