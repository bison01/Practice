

public class Reverse
{
 
  public static void main (String args[])
  {
     String str ="Please reverse me";
     String split[]=str.split("\\s");
     
     String reverse="";
     
     for (int i=split.length-1; i >=0 ; i--)
     {
      
       reverse=reverse+split[i]+" ";  
       
       }
  
  System.out.println("Reversed string is : " + reverse);
  
  }
  

}