public class nc4{
  public static void main(String[] args) {
    int[] arr1={12,36,24,60,48};
    int temp =0;
    int maxElement =0;
    for (int i = 0; i < arr1.length; i++) 
    {
       maxElement = i;
      for (int j = i+1; j < arr1.length; j++) 
      {
        if (arr1[j]<arr1[maxElement]) {
          maxElement = j;
        }
      }
      temp = arr1[i];
        arr1[i]=arr1[maxElement];
        arr1[maxElement]=temp;
    }
    for(int i=0;i<arr1.length;i++){
      System.out.print(arr1[i] + " ");
    }
  }
}
// Selection sort nc_0.6 Take_11