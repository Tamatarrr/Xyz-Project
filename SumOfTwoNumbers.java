import java.util.*;
class SumOfTwoNumbers{
  public static void main(String[] args){
    int[] arr = {2,4,5,8};
    System.out.println(Arrays.toString(arr));
    changeArray(arr);
    System.out.println(Arrays.toString(arr));
  }
  public static void changeArray(int[] xyz){
    xyz[0]=18;
  }
}
  // public static void swap(int a,int b){
  //   int temp = a;
  //   a=b;
  //   b=temp;
  // }
  // public static double sum2(double a,double b){
  //   double sum=a+b;
  //   return sum;
  // }
  // public static int power(int b,int p){
  //   int ans=1;
  //   for(int i=1;i<=p;i++){
  //     ans=ans*b;
  //   }
  //   return ans;
  // }
  // public static int sum1(){
  //   Scanner scnr = new Scanner(System.in);
  //   System.out.print("Enter First number: ");
  //   int a,b;
  //   double sum;
  //   a =scnr.nextInt();
  //   System.out.print("Enter Second number: ");
  //   b =scnr.nextInt();
  //   sum=a+b;
  //   return sum;
    
  // }
  // public static void sum(){
  //   Scanner scnr = new Scanner(System.in);
  //   System.out.print("Enter First number: ");
  //   int a,b,sum;
  //   a =scnr.nextInt();
  //   System.out.print("Enter Second number: ");
  //   b =scnr.nextInt();
  //   sum=a+b;
  //   System.out.println("Sum of Numbers: "+sum);
  // }
  // public static void greetings(){
  //   System.out.println("hello");
  // }
//   public static String greetings1(String name){
//     String msg = "Hi! "+name+". Hope you have a great day.";
//     return msg;
//   }
// }
  // accessModifier static returntype nameOfFunction(parameters/Arguments){
  // Code
  // return;
  //}