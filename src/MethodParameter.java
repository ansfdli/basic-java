public class MethodParameter {
  public static void main(String[] args) {

    sayHello("haha", "hehe");
    sayHello("bebe", "baba");
  }

  static void sayHello(String firstName, String lastName){
    System.out.println("hello " + firstName + " " + lastName);
  }
}
