public class nc3{
  public static void main(String[]args){
    int[] numarr={4,6,8,3,9};
    System.out.println("Before sorting:");
    System.out.println(java.util.Arrays.toString(numarr));
    System.out.println();
    sortNumArray(numarr);
    
  }
  public static void sortNumArray(int[] array){
    int temp = 0;
    for(i=0; i<=array.length-1;i++){
      for(j=0; j<array.length-i; j++){
        if(array[j]>array[j+1]){
          temp = array[j];
          array[j]=array[j+1];
          array[j+1]=temp; 
        }
      }
    }
    System.out.println(java.util.Arrays.toString(array))
  }
}
