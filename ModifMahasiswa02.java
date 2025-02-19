import java.util.Scanner;
public class ModifMahasiswa02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama;
        String nim;
        String kelas;
        String ipk;
    
        void tampilkanInformasi() {
            System.out.println("Nama" + nama);
            System.out.println("NIM" + nim);
            System.out.println("Kelas" + kelas);
            System.out.println("IPK" + ipk);
        }
        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }
        void updateIPK(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk =ipkBaru;
            } else {
                System.out.println("IPK tidak valid, harus antara 0.0 dan 4.0");
            }
        }
        String nilaiKinerja() {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja kurang";
            }
        }
    }
}
