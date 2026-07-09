import java.util.Scanner;
public class Hello {
  public static void main (String args[]) {
    Scanner scnr = new Scanner(System.in);
    int num;
    System.out.println("Enter a Number: ");
    num = scnr.nextInt();
    if(num>0){
      System.out.println("Number is positive");
    }
    else if(num<0){
      System.out.println("Number is Negative");
    }
    else{
      System.out.println("Number is Zero");
    }
  }
}
