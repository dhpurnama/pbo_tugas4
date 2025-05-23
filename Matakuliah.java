public class Matakuliah {
  private String kode;
  private String nama;
  private String index;
  public int sks;

  /* Konstruktor */
  public Matakuliah(String kode, String nama, String index, int sks) {
    super();
    this.kode = kode;
    this.nama = nama;
    this.index = index;
    this.sks = sks;
  }

  public double nilailndex() {
    // Berdasarkan index matakuliah
    // A= 4, AB = 3.5, B = 3, BC = 2.5, C=2, D= l , E=O
    double nilIdx;

    if (index == "A") nilIdx = 4;
    else if (index == "AB") nilIdx = 3.5;
    else if (index == "B") nilIdx = 3;
    else if (index == "BC") nilIdx = 2.5;
    else if (index == "C") nilIdx = 2;
    else if (index == "D") nilIdx = 1;
    else nilIdx = 0;

    return nilIdx;
  }

  public String display() {
    return kode + " - " + nama + " - " + index;
  }
}