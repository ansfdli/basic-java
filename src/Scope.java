public class Scope {
  public static void main(String[] args) {

    sayHello("jaja");
    sayHello(""); // tidak keluar nama karena nama kosong
  }
    static void sayHello(String name){
    String hello = "hello " + name;

    if(!name.isBlank()){ // tidak keluar nama karena nama kosong
      String hi = "hi " + name;
      System.out.println(hi);
    }
    System.out.println(hello);
  }
}

// komentar multiline untuk dokumentasi kode
/**
 * komen1
 * komen2
 * komen3
 */