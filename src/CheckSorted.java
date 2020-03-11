
public class CheckSorted {

	public static boolean sorted(int arr[],int n)
	
	{
		
		for (int i=1;i<n;i++)
		{
			if(arr[i-1] > arr[i])
			{
              return false;				
			}

				
		}
		
			return true ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {2,3,4,5,6,0};
		
		int n=arr.length;
		
		if(sorted(arr,n)==true)
		{
			System.out.println("Sorted array");
		}
		else 
		{

			System.out.println("Not Sorted array");
			
		}

		
		
		
	}

}
