import java.util.*;
class Fibonacci
{ 
  public static void main(String args[])
 {
   Scanner obj=new Scanner(System.in);
   int a=0,b=1,i,tempa,tempb,n;
   System.out.println("Enter no. of elements to be there in fibonacci series");
   n=obj.nextInt();
   System.out.print("0 1 ");
   for(i=1;i<=n-2;i++)
   { 
      System.out.print(a+b+" ");
      tempa=a;
      tempb=b;
      a=tempb;
      b=tempa+tempb;
   }
 }
}