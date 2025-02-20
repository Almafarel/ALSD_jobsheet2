import java.util.Scanner;
class Mahasiswa {
    String nama;
    String nim;
    String kelas;
    double ipk;

    public Mahasiswa() {     
    }
    
    public Mahasiswa(String nm, String nim, double ipk, String kls) {
        this.nama = nm;
        this.nim = nim;
        this.ipk = ipk;
        this.kelas = kls;
    }

    void tampilkanInformasi() {
        System.out.println("Nama  : " + nama);
        System.out.println("NIM   : " + nim);
        System.out.println("IPK   : " + ipk);
        System.out.println("Kelas : " + kelas);
        System.out.println("---------------------------");
    }
    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
        System.out.println("Kelas menjadi " + kelas);
    }

    void updateIPK(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            ipk = ipkBaru;
            System.out.println("IPK menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid, harus antara 0.0 dan 4.0");
        }
    }
}

public class mahasiswaMain02 {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55; 
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60); 
        mhs1.tampilkanInformasi();

        Mahasiswa mhs2 = new Mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();
    }
}

