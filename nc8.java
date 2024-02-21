public class nc8{
  public static void main(String[]args){
    int number = 6;
    int count = 0;
    for(int i=0; i<=number; i++){
      if(num%i==0){
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
