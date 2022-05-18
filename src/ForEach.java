public class ForEach {
  public static void main(String[] args) {

    String[] array = {
        "hehe", "haha", "hoho"
    };

    for (int i = 0; i < array.length; i++){
      System.out.println(array[i]);
    }

    System.out.println("FOR EACH");

    // for each
    for(var name: array){
      System.out.println(name);
    }
  }
}
