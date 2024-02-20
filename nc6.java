//Functions in js
import java.util.*;
public class nc6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int ans = printArmstrong(num);
    System.out.println(ans);
  }
  static int printArmstrong(Number){
    int sum = 0;
    while(Number < 0){
      LD = Number % 10;
      Number = Number / 10;
      sum = sum + (LD * LD * LD);  
    }
    return sum;
  }

}




