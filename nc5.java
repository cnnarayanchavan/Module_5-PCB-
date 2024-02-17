// Insertion sort.
public class nc5 {

  public static void main(String[] args) {
    int[]arr ={2,4,3,6,7};
    for(int i=1; i<arr.length; i++){
      int temp= arr[i];
      int j=i-1;
      while (j>=0 && temp<arr[j]) {
        arr[j+1]=arr[j];
        j--;
      }
      arr[j+1]=temp;
    }
    System.out.println(java.util.Arrays.toString(arr));
  }
}
