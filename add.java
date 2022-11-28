public class Abc{
     public static void main(String args[])
     {
         System.out.println("Sum of elements of array are");
         int a[]={10,20,30};
         int sum=0;
         for(int s=0;s<a.length;s++){
             sum=sum+a[s];
         }
         System.out.print(sum);         
     }
}
