public class nc12{
  public static void main(String[]args){
   Op objcet1 = new Op();
   Op.operationsOn("Narayana");
    //System.out.println(result);
  }
}
class Op{
   static int operationsOn(int num1, int num2){
    return num1 + num2;
  }
   static int operationsOn(double num1, double num2){
    return (int) (num1 * num1);
}
    static int operationsOn(int num1, int num2, int num3){
    return num1 + num2 + num3;
}
     static void operationsOn(String name){
     System.out.println("Hey"+ " " +name);
}
}
