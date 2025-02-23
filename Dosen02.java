public class Dosen02 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen02(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
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
    }
    public void setStatusAktif(boolean status) {
        this.statusAktif = status;
    }
    public int hitungMasaKerja(int thnSkrg) {
        return thnSkrg - this.tahunBergabung;
    }
    public void ubahKeahlian(String bidang) {
        this.bidangKeahlian = bidang;
    }
    public static void main(String[] args) {
        Dosen02 dosen = new Dosen02("D123", "Saipul Jamal S.T.", true, 2010, "Informatika");
        dosen.tampilInfo();
        System.out.println("Masa Kerja: " + dosen.hitungMasaKerja(2025) + " tahun");
    }
}
