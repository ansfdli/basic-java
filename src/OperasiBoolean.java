public class OperasiBoolean {
  public static void main(String[] args) {

    var absen = 75;
    var nilaiAkhir = 80;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilaiAKhir = nilaiAkhir >= 80;

    var lulus = lulusAbsen && lulusNilaiAKhir;
    System.out.println(lulus);

  }
}
