import java.util.Scanner;
import java.util.Arrays;
public class Activity4B_DAT2A_LALUNA {
   
    public static int[] addValue(int n, int arr[], int x)
   {
       int i;
   
       
       int newarr[] = new int[n + 1];
   
     
       for (i = 0; i < n; i++)
           newarr[i] = arr[i];
   
       newarr[n] = x;
   
       return newarr;
   }
     public static int[] findLocationDelete(int[] value, int index)
    {
 
        
        if (value == null || index < 0
            || index >= value.length) {
 
            return value;
        }
 
      
        int[] anotherArray = new int[value.length - 1];
 
       
        for (int i = 0, k = 0; i < value.length; i++) {
 
           
            if (i == index) {
                continue;
            }
 
          
            anotherArray[k++] = value[i];
        }
 
        
        return anotherArray;
    }
    

      public static void main(String[] args){
          Scanner lew=new Scanner(System.in);
          System.out.println("       Array");
          System.out.println("______________________________");
          System.out.println("   1 Insert a value.");
          System.out.println("   2 Delete a value.");
          System.out.println("   3 Traverse a value.");
          System.out.println("   4 Exit.");
          System.out.println("______________________________");
           System.out.print("Enter the number: ");
           String num = lew.next();
           
           
   switch(num){
       
       case "2":{
           System.out.println("______________________________");
           System.out.print("Enter the length :");
           int length=lew.nextInt();
          System.out.println("______________________________");
       

   System.out.println("Enter the "+length+" element ");
   int[] value = new int[length];
   for (int i = 0; i < value.length; ++ i) {
     
     value[i]=lew.nextInt();
   }
    System.out.println("______________________________");
            System.out.print("Index to be delete: ");
            int index=lew.nextInt();
            
            
        // Remove the element
        value =findLocationDelete(value, index);
           
         System.out.println("Array value: "
                           + Arrays.toString(value));
       }break;
       
       case "1":{
           System.out.println("______________________________");
           System.out.print("Enter the length :");
           int length=lew.nextInt();
          System.out.println("______________________________");
       

   System.out.println("Enter the "+length+" element ");
   int[] value = new int[length];
   for (int i = 0; i < value.length; ++ i) {
     
     value[i]=lew.nextInt();
   }
    System.out.println("______________________________");
            System.out.print("Index to be Add: ");
            int index=lew.nextInt();
        
       // call the method to add x in arr
       value = addValue(value.length, value,index);
   
       // print the updated array
       System.out.println("\nArray with " + index
                          + " added:\n"
                          + Arrays.toString(value));
           
         
       }break;
       case "3":{
           System.out.println("______________________________");
           System.out.print("Enter the length :");
           int length=lew.nextInt();
          System.out.println("______________________________");
       

   System.out.println("Enter the "+length+" element ");
   int[] value = new int[length];
   for (int i = 0; i < value.length; ++ i) {
     
     value[i]=lew.nextInt();
   }
    System.out.println("______________________________");
            System.out.println("Traverse Array: ");
           for (int i = 0; i < value.length; ++ i) {
      System.out.println(value[i]);
     
   }
       }break;
       
        case "4":{
           System.out.println("______________________________");
           System.out.print("!!THANK YOU FOR USING THE SYSTEM!!!!");
           
           System.exit(0);
           
       }break;
      
   }
 

        
    }
}
