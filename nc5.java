public class nc5{
  public static void main(String[]args){
    int[] arr = {5,4,1,2,9};
    sortUsingInsertion(arr);
  }
  
  
  public static void sortUsingInsertion(int[] arr){
    //here we will start the i from index 1 coz we assume the first element of an array is alrady sorted
    for(int i = 1; i<arr.length; i++){
      int temp = arr[i];
      int j = i-1;
      while(j>=0 && temp<arr[j]){
        arr[j+1] = arr[j];
        j--;
      }
    arr[j+1]=temp;
    }
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }  
} 
