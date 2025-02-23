public class MatkulMain02 {
    String KodeMK;
    String name;
    int Sks;
    int jumlhJam;

    public MatkulMain02() {
        this.KodeMK = "Unknown";
        this.name = "Unknown";
        this.Sks = 0;
        this.jumlhJam = 0;
    }
    public MatkulMain02(String KodeMK, String name, int Sks, int jumlhJam) {
        this.KodeMK = KodeMK;
        this.name = name;
        this.Sks = Sks;
        this.jumlhJam = jumlhJam;
    }
    public void tampilInfo() {
        System.out.println("Kode Mata Kuliah: " + KodeMK);
        System.out.println("Nama Mata Kuliah: " + name);
        System.out.println("SKS: " + Sks);
        System.out.println("Jumlah Jam: " + jumlhJam);
        System.out.println("==============");
    }
    public void rubahSKS(int sksNyar) {
        this.Sks = sksNyar;
    }
    public void nambahJam(int jam) {
        this.jumlhJam += jam;
    }
    public void ngurangiJam(int jam) {
        if (this.jumlhJam - jam >= 0) {
            this.jumlhJam -= jam;
        } else {
            System.out.println("Jumlah jam tidak bisa kurang dari 0.");
        }
    }

    public static void main(String[] args) {
        MatkulMain02 mk1 = new MatkulMain02();
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInfo();

        // Membuat objek menggunakan konstruktor berparameter
        MatkulMain02 mk2 = new MatkulMain02("IF101", "Pemrograman Java", 3, 4);
        System.out.println("Informasi Mata Kuliah 2:");
        mk2.tampilInfo();

        // Mengubah SKS mk2
        mk2.rubahSKS(4);
        System.out.println("Setelah mengubah SKS:");
        mk2.tampilInfo();

        // Menambah jam mk2
        mk2.nambahJam(2);
        System.out.println("Setelah menambah jam:");
        mk2.tampilInfo();

        // Mengurangi jam mk2
        mk2.ngurangiJam(3);
        System.out.println("Setelah mengurangi jam:");
        mk2.tampilInfo();
    }
    }

    

