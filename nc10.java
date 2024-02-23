// selection sort 
import java.util.*;  //imported all needed packeges 
public class nc10{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);  
    //for printing the arrays form user there are three type inwhich 
    //1] we can directly diclear the array 
    //2] we can initialise array first 
    //3] aslo initialise the array first 
    //as we are printing here so we have to only initialise it fisrt, then add the elements into it 
    int Num = sc.nextInt();
    int arr[] = new int[Num];
    for(int i=0; i<=Num; i++){
      arr[i] = sc.nextInt();  //and now here we have to print the arr now that num
    }
    System.out.println(java.util.Arrays.toString(arr));
  }
}
