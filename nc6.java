//Functions in js
import java.util.*;
public class nc6{
  public static void main(String[] args){
    //function for simple adding two numbers
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int num = sc.nextInt();
    int original = num;
    //int ans = printSum(12,12);
      //System.out.println(ans);
    int ans = printArmstrong(num);
    System.out.println(ans);
    
  }
  // static int printSum(int num1, int num2){
  //   return num1 +num2;
  // }
  // this one is just the normal example of how function works in java.
// que of printing armstrong numbers
   public static int printArmstrong(Number){
    while(Number < 0){
    
      LD = Number % 10;
      Number = Number / 10;
      sum = sum + (LD * LD * LD);
      
    }
    if(sum == Number)
    {
      System.out.println("True");
    }
    else
    {
      System.out.println("False");
    }
    return sum;
  }

}




