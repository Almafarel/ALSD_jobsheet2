public class Matkul02 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public Matkul02() {
        this.kodeMK = "Undifenid";
        this.nama = "Undefind";
        this.sks = 0;
        this.jumlahJam = 0;
    }
    public Matkul02(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }
    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
    }
    public void tambahJam(int jam) {
        this.jumlahJam += jam;
    }
    public void kurangiJam(int jam) {
        if (this.jumlahJam >= jam) {
            this.jumlahJam -= jam;
        } else {
            System.out.println("Pengurangan pada jam");
        }
    }

    public static void main(String[] args) {
        Matkul02 mk1 = new Matkul02();
        mk1.tampilInformasi();
        Matkul02 mk2 = new Matkul02("CS101", "Pemrograman Java", 3, 6);
        mk2.tampilInformasi();
    }
}
