//functions in js

import java.util.Scanner;

public class nc6{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int number = sc. nextInt();
    int original = number;
    System.out.println(printArm(number));
  }

  static int printArm(int Num){
    int sum = 0;
    while(Num<0){
    ld = Num%10;
    Num = Num/10;
    sum = sum + (ld*ld*ld);  
    }  
    if(Num==Original){
      System.out.prinln("true")
    }
    else{
      System.out.prinln("false")
    }
    return sum ;
  }
}
