//functions in js

import java.util.Scanner;

public class nc6{
  public static void main(String[]args){
    Scanner in = new Scanner(System.in);
    int number = in. nextInt();
    int ans = printArm(number);
    System.out.println(ans);
    for(int i = 100; i<1000;i++){
      if(printArm(i)){
        System.out.println(printArm(i));
      }
    }
  }

  static int printArm(int n){
    int original = n;
    int sum = 0;
    while(n>0){
    int ld = n%10;
    n = n/10;
    sum = sum + (ld*ld*ld);  
    }  
     if(n==original){
       System.out.println("true");
     }
     else{
       System.out.println("false");
     }
    return sum ;
  }
}
