// recise the sorting technique that we learnt 
public class nc9{
  public static void main(String[] args){
    //int[]arr = {5,4,3,2,1};
    int[]arr = {56,35,76,45,89,67,45,87};
    for(int i=0; i<arr.length; i++){
      for(int j=0; j<arr.length-1-i; j++){  //reduce some more iteration by letting inner loop to run only for unsorted element
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
    for(int i=0; i<arr.length; i++){
        System.out.print(arr[i] + " ");
      }
  }
}
