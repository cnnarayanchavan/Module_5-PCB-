public class nc1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Hello Narayana");
        int[] array1 = {12,13,14,15,16};
        System.out.println(java.util.Arrays.toString(array1));
        for (int i = 0; i < array1.length; i++) {
            sum++;
        }
        System.out.println("Total elements in array:" +sum);
        //OR
        System.out.println("Length of an array:" +array1.length);
    }
}
