public class nc8{
  public static void main(String[]args){
    int number = 6;
    int count = 0;
    for(int i=1; i<=number; i++){  //have to start form 1
      if(number%i==0){
        count++;
      }
    }
    if(count==2){
      System.out.println("Prime number");
    }
    else{
      System.out.println("Not Prime number");
    }
  }
}
