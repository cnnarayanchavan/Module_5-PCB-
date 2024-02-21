public class nc7{
  public static void main(String[]args){
    int number = 4;
    for(int i=1; i<=number; i++){
      //for(int j=1; j<=number; j++){  // for normal pattern 
      //for(int j=i; j<=number; j++){  // for reverse trangle
      for(int j=1; j<=i; j++){
        System.out.print("*"); 
      }
        System.out.println();
    }
  }
}
