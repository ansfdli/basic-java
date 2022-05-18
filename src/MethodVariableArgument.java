public class MethodVariableArgument {
  public static void main(String[] args) {

    // tanpa variable argument
    int[] values = {60, 70, 80, 50, 80};
    sayCongrats("Jaja", values);

    // dengan variable argument
    sayCongrats("Jojo", 79, 90, 78, 90);
  }



    // tanpa variable argument
    //  static void sayCongrats(String name, int[] values)

    // dengan variable argument
  static void sayCongrats(String name, int... values){
    var total = 0;
    for (var value : values){
      total += value;
    }
    var finalValue = total / values.length;

    if (finalValue >= 75){
      System.out.println("Selamat " + name + ", Anda Lulus");
    } else {
      System.out.println("Maaf " + name + ", Anda Tidak Lulus");
    }
  }
}
