import org.w3c.dom.ls.LSOutput;

public class SwitchStatement {
  public static void main(String[] args) {

    var nilai = "A";

    switch (nilai) {
      case "A" :
        System.out.println("Lulus Dengan Baik");
        break;
      case "B" :
      case "C" :
        System.out.println("Lulus");
        break;
      case  "D" :
        System.out.println("Tidak Lulus");
        break;
      default:
        System.out.println("Salah Jurusan");
    }

    //Switch Lambda (Java 14 above)

    switch (nilai) {
      case  "A" -> System.out.println("Lulus Dengan Baik");
      case  "B", "C" -> System.out.println("Lulus");
      case "D" -> System.out.println("Tidak Lulus");
      default -> {
        System.out.println("Salah Jurusan");
      }
    }

    //Yield (Java 14 above)

    String pesan;
    switch (nilai) {
      case  "A" -> pesan = "Lulus Dengan Baik";
      case  "B", "C" -> pesan = "Lulus";
      case "D" -> pesan = "Tidak Lulus";
      default -> pesan = "Salah Jurusan";
    }
    System.out.println(pesan);

    //Yield (Java 14 above)
    pesan = switch (nilai){
      case  "A":
        yield  "Lulus Dengan Baik";
      case  "B", "C":
        yield  "Lulus";
      case "D":
        yield  "Tidak Lulus";
      default:
        yield "Salah Jurusan";
    };
    System.out.println(pesan);
  }
}
