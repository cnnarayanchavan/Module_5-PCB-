// recise the sorting technique that we learnt 
public class nc9{
  public static void main(String[] args){
    int[] arr = {5,4,3,2,1};
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length; j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=arr[j];
        }
      }
    }
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
  }
}
