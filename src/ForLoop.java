public class ForLoop {
  public static void main(String[] args) {

    var counter = 1;

    for(; counter <= 10 ;){
      System.out.println("Perulangan " + counter);
      counter++;
    }

    // for loop using init statement
    for(var counter2 = 2; counter2 <= 10;){
      System.out.println("test " + counter2);
      counter2++;
    }

    // for loop using post statement
    for(var counter3 = 3; counter3 <= 10; counter3++){
      System.out.println("test post " + counter3);
    }
  }
}
