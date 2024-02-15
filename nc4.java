//Selection sort nc_0.6_take_9
public class nc4{
  public static void main(String[] args){
    int[] array = {32,26,40,24,8,80};
    // System.out.println("Before Sorting");
    // System.out.println(java.util.Arrays.toString(array));
    // System.out.println("After Sorting");
     sortUsingSelection(array);



  }
  public static void sortUsingSelection(int[] arr){
    for(int i=0; i<arr.length; i++){
      int maxElement=i;
      int temp =0;
      for(int j=i+1; i<arr.length; j++){
       if(arr[maxElement]>arr[j]){
         maxElement=arr[j];
       } 
        temp = arr[i];
        arr[i]=arr[maxElement];
        arr[maxElement]=temp;
      }
       for(i=0; i<arr.length; i++){
      System.out.println(array[i] + " ")
    }
    }
  }
}
