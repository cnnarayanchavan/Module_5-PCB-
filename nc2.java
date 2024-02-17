// Bubble sort.
public class nc2{
    static void sortingArray(int[] Array1){
        //System.out.println(java.util.Arrays.toString(arr));
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array1.length-1-i; j++) {
                if (Array1[j]>Array1[j+1]) {
                    int temp = Array1[j];
                    Array1[j] = Array1[j+1];
                    Array1[j+1] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(Array1));

    }
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};
        sortingArray(arr);
    }
}
