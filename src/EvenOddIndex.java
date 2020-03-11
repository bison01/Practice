//Java implementation to 
//arrange odd and even numbers 

import java.util.*; 
import java.lang.*; 

class EvenOddIndex { 

//function to arrange 
//odd and even numbers 
public static void arrangeOddAndEven(int arr[], int n) 
{ 
	int oddInd = 1; 
	int evenInd = 0; 
	while (true) 	
	{ 
		while (evenInd < n && arr[evenInd] % 2 == 0) 
			evenInd += 2; 
			
		while (oddInd < n && arr[oddInd] % 2 == 1) 
			oddInd += 2; 
			
		if (evenInd < n && oddInd < n) 
			{ 
				int temp = arr[evenInd]; 
				arr[evenInd] = arr[oddInd]; 
				arr[oddInd] = temp; 	
			} 
			
		else
			break; 
	} 
} 

//function to print the array 
public static void printArray(int arr[], int n) 
{ 
	for (int i = 0; i < n; i++) 
		System.out.print(arr[i] + " "); 
} 


public static void printEvenOddIndexes(String[] strings) {          
	System.out.println("\n");
	
	for(int i=0 ; i <strings.length;i++)
	{
		if(i%2==0)
		{
			System.out.println("Even Indexed word is : "+ strings[i]);
		}
		else
		{
			System.out.println("Odd Indexed word is : "+ strings[i]);

		}
		
	}
	
	/*for (String word : strings) {

        for (int i = 0; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }

        System.out.print(" ");

        for (int i = 1; i < word.length(); i += 2) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
    }*/
 }
	
//Driver function 
public static void main(String argc[]){ 
	int arr[] = { 3, 6, 12, 1, 5, 8 }; 
	int n = arr.length; 

	
	System.out.print("Original Array: "); 
	printArray(arr, n); 

	arrangeOddAndEven(arr, n); 
	
	
	System.out.print("\nModified Array: "); 
	printArray(arr, n); 
	
	String[] strings= {"0even", "1odd","2even","3xodd"}; 
	printEvenOddIndexes(strings);

} 
} 

//This code is contributed by Sagar Shukla 
