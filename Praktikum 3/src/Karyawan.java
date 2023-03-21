public class Karyawan {
    private String nama;
    private String kantorCabang;
    private int lamaBekerja; // dalam bulan
    private String jabatan;

    public Karyawan(String nama, String kantorCabang, int lamaBekerja, String jabatan) {
        this.nama = nama;
        this.kantorCabang = kantorCabang;
        this.lamaBekerja = lamaBekerja;
        this.jabatan = jabatan;
    }

    public String getNama() {
        return nama;
    }

    public String getKantorCabang() {
        return kantorCabang;
    }

    public int getLamaBekerja() {
        return lamaBekerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void printKaryawan() {
        System.out.println("Nama Karyawan : " + getNama());
        System.out.println("Kantor Cabang : " + getKantorCabang());
        System.out.println("Lama Bekerja  : " + getLamaBekerja());
        System.out.println("Jabatan       : " + getJabatan());
    }
}
