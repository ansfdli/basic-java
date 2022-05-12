public class TipeDataBukanPrimitif {
  public static void main(String[] args) {

    Integer iniInteger = 200;
    Long iniLong = 100000000L;
    Byte iniByte = null;

    System.out.println(iniByte);
    System.out.println(iniLong);

    // konversi dari tipe data primitif ke bukan primitif (Object)

    int iniInt = 100;

    Integer iniObject = iniInt;

    // konversi tipe data yang tidak compatible

    short iniShort = iniObject.shortValue();
    long iniLong2 = iniObject.longValue();
    float iniFloat = iniObject.floatValue();
  }
}
