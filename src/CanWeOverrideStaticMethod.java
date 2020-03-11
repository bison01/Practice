
/**
*
* Java program which demonstrate that we can not override static method in Java.
* Had Static method can be overridden, with Super class type and sub class object
* static method from sub class would be called in our example, which is not the case.
* @author
*/
public class CanWeOverrideStaticMethod {

   public static void main(String args[]) {
    
      Screen scrn = new ColorScreen();
       ColorScreen cso= new ColorScreen();
       
       
       
       //if we can  override static , this should call method from Child class
      scrn.show(); //IDE will show warning, static method should be called from classname
    
       
       cso.show();
   } 

}

class Screen{

   /*
    * public static method which can not be overridden in Java
    */
   public static void show(){
       System.out.printf("Static method from parent class");
   }
}

class ColorScreen extends Screen{
   /*
    * static method of same name and method signature as existed in super
    * class, this is not method overriding instead this is called
    * method hiding in Java
    */
   public static void show(){
       System.err.println("\n Overridden static method in Child Class in Java");
   }
}

