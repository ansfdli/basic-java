public class Array {
  public static void main(String[] args) {

    String[] stringArray;
    stringArray = new String[3];

    stringArray[0] = "hehe";
    stringArray[1] = "hihi";
    stringArray[2] = "hoho";

    System.out.println(stringArray[0]);
    System.out.println(stringArray[1]);
    System.out.println(stringArray[2]);


    String[] stringArray2 = new String[3]; // ditulis langsung tanpa deklarasi

    //Aray initializer
    String[] namaNama = {
            "haha", "hehe", "hoho"
    };
    //Aray initializer
    int[] arrayInt = new int[]{
            1, 2, 3, 4, 5
    };
    //Aray initializer
    long[] arrayLong = {
            10L, 20L, 30L
    };

    //"menghapus data array"
    namaNama[0] = null;

    System.out.println(arrayLong.length);

    //array didalam array
    String[][] members = {
      {"hihi", "hihiop"},
      {"pipip","opoppo"},
      {"llolo", "jojoj", "kokoko"},
    };

    System.out.println(members[1][0]);
  }
}
