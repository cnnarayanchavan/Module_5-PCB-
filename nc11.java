public class nc11{
  public static void main(String[]args){
    //Father obj1 = new Father();
    //obj1.fathersPhone();
    //obj1.fathersPhone();
    Son s1 = new Father();
    Son obj2 = new Son();
    obj2.fathersPhone();
  }
}
class Father{
  public static void fathersPhone(){
    System.out.println("I have blueberry6600");
  }
}
class Son extends Father{
  public static void fathersPhone(){
    System.out.println("I have Nokia6600");
  }
}

