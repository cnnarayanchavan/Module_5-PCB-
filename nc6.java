//functions in js

import java.util.Scanner;

public class nc6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int number = sc. nextInt();
    System.out.println(printArm(number));
  }

  static int printArm(int Num){
    int original = Num;
    int sum = 0;
    while(Num<0){
    int ld = Num%10;
    Num = Num/10;
    sum = sum + (ld*ld*ld);  
    }  
    if(Num==original){
      System.out.println("true");
    }
    else{
      System.out.println("false");
    }
    return sum ;
  }
}
