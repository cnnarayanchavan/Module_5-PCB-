public class nc4{
  public static void main(String[] args){
    int array = {34,56,67,23,41,14};
    System.out.println("Before Sorting");
    System.out.println(java.util.Arraya.toString(array));
    System.out.println("After Sorting");
    sortUsingSelection(array);
    

  }
  public static void sortUsingSelection(int[] arr){
    for(i=0; i<arr.length; i++){
      let maxElement=i;
      int temp =0;
      for(j=i+1; i<arr.length; j++){
       if(arr[maxElement]>arr[j]){
         maxElement=arr[j]
       } 
        temp = arr[maxElement];
        arr[maxElement]=arr[j];
        arr[j]=temp;
      }
      System.out.println(java.util.Arrays.toString(arr))
    }
  }
}
