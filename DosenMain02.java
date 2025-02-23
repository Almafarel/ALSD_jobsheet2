public class DosenMain02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public DosenMain02() {
        this.idDosen = "";
        this.nama = "";
        this.statusAktif = false;
        this.tahunBergabung = 0;
        this.bidangKeahlian = "";
    }
    public DosenMain02(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    public void tampilInfo() {
        System.out.println("ID Dosen: " + idDosen);
        System.out.println("Nama: " + nama);
        System.out.println("Status Aktif: " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println();
    }
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }
    public int hitungMasaKerja(int tahunSkrg) {
        return tahunSkrg - tahunBergabung;
    }
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
    public static void main(String[] args) {
        DosenMain02 dosen1 = new DosenMain02();
        dosen1.tampilInfo();

        DosenMain02 dosen2 = new DosenMain02("D001", "Dr. Budi Santoso", true, 2010, "Kecerdasan Buatan");
        dosen2.tampilInfo();

        dosen2.setStatusAktif(false);
        System.out.println("Tergabung selama " + (dosen2.hitungMasaKerja(2020)) + " tahun");

        dosen2.ubahKeahlian("Pembelajaran Mesin");
        dosen2.tampilInfo();
    }

}
