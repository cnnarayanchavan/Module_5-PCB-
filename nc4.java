public class nc4{
  public static void main(String[] args) {
    int[] arr1={12,43,23,56,34};
    int temp =0;
    for (int i = 0; i < arr1.length; i++) {
      int maxElement =i;
      for (int j = i+1; j < arr1.length; j++) {
        if (arr1[maxElement]>arr1[j]) {
          maxElement = arr1[j];
        }
        temp = arr1[i];
        arr1[i]=arr1[maxElement];
        arr1[maxElement]=temp;
      }
      for(i=0;i<arr1.length;i++){
        System.out.print(arr1[i] + " ");
      }
    }
  }
}
// Selection sort nc_0.6 Take_11