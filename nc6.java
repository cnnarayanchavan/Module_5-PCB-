// WAP to find the number is weather armstrong or not
public class nc6 {





  public static void main(String[] args) {
    int num = 333;
    boolean ans = printArm(num);
    System.out.println(ans);
    // for (int i = 100; i < 1000; i++) {
    //   if (printArm(i)) {
    //     System.out.print(i + " ");
    //   }
    // }
  }

  static boolean printArm(int n) {
    int sum = 0;
    int original = n;
    while (n>0) {
      int ld=n%10;
      n=n/10;
      sum=sum+ld*ld*ld;
    }
    // if (sum == original) {
    //   System.out.println("ture");
    // }
    // else{
    //   System.out.println("False");
    // }
   return sum == original;
  }
}