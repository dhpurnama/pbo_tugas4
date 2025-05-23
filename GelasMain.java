public class GelasMain {

  public static void main(String[] args) {
    Gelas gl = new Gelas("Hitam");
    Gelas g2 = new Gelas("Biru");
    tukarWarnaGelas(gl, g2);
    System.out.println("Warna gl : " + gl.getWarna());
    System.out.println("Warna g2 : " + g2.getWarna());
  }

  static void tukarWarnaGelas(Gelas gl, Gelas g2) {
    Gelas gTemp = new Gelas("Temp");
    gTemp.setWarna(gl.getWarna());
    gl.setWarna(g2.getWarna());
    g2.setWarna(gTemp.getWarna());
  }
}
