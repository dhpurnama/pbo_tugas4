public class MatakuliahMain {
  public static void main(String[] args) {
    double TotalNilailndexSKS, TotalSKS, IPK;

    //Create objek matakuliah
    Matakuliah mkl = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
    Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
    Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

    // Tampilkan daftar matakuliah
    System.out.println("--- DAFTAR MATAKULIAH ---");
    System.out.println(mkl.display());
    System.out.println(mk2.display());
    System.out.println(mk3.display());
    System.out.println("--- Nilai IPK - --");

    // Bagaimana hitung IPK?
    // Rumus: (index_nilai*sks)+(index_nilai*sks)+ .. +(index_nilai*sks)/total_sks
    TotalNilailndexSKS = mkl.nilailndex() * mkl.sks + mk2.nilailndex() * mk2.sks + mk3.nilailndex() * mk3.sks;
    TotalSKS = mkl.sks + mk2.sks + mk3.sks;
    IPK = TotalNilailndexSKS / TotalSKS;
    System.out.printf("IPK : %.2f", IPK);
  }
}
