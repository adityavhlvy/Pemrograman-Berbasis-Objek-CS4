interface PenghitunganGaji {
    double hitungGajiPokok();
    double hitungBonus();
    void cetakGaji();
}

class Pegawai implements PenghitunganGaji {
    private String nama;
    private String jabatan;
    private double gajiPokok;
    private double bonus;

    public Pegawai(String nama, String jabatan) {
        this.nama = nama;
        this.jabatan = jabatan;
    }

    public void setGajiPokok(double gaji) {
        this.gajiPokok = gaji;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double hitungGajiPokok() {
        return gajiPokok;
    }

    public double hitungBonus() {
        return bonus;
    }

    public void cetakGaji() {
        System.out.println("Gaji Pokok: " + gajiPokok);
        System.out.println("Bonus: " + bonus);
    }
}

class PegawaiLembur extends Pegawai {
    private int jamLembur;

    public PegawaiLembur(String nama, String jabatan, int jamLembur) {
        super(nama, jabatan);
        this.jamLembur = jamLembur;
    }

    @Override
    public double hitungGajiPokok() {
        // Implement the calculation of basic salary considering overtime
        return super.hitungGajiPokok() + (jamLembur * 10000);
    }

    @Override
    public double hitungBonus() {
        // Implement the calculation of bonus for overtime employees
        return super.hitungBonus() + (jamLembur * 5000);
    }
}

class PegawaiPajak extends Pegawai {
    private double persentasePajak;

    public PegawaiPajak(String nama, String jabatan, double persentasePajak) {
        super(nama, jabatan);
        this.persentasePajak = persentasePajak;
    }

    @Override
    public double hitungGajiPokok() {
        // Implement the calculation of basic salary considering tax
        double gajiPokokSebelumPajak = super.hitungGajiPokok();
        return gajiPokokSebelumPajak - (gajiPokokSebelumPajak * persentasePajak);
    }

    @Override
    public double hitungBonus() {
        // Implement the calculation of bonus for taxed employees
        return super.hitungBonus();
    }
}

public class App {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai("John Doe", "Manager");
        pegawai1.setGajiPokok(5000000);
        pegawai1.setBonus(1000000);

        PegawaiLembur pegawai2 = new PegawaiLembur("Jane Smith", "Staff", 10);
        pegawai2.setGajiPokok(3000000);
        pegawai2.setBonus(500000);

        PegawaiPajak pegawai3 = new PegawaiPajak("Michael Johnson", "Analyst", 0.1);
        pegawai3.setGajiPokok(4000000);
        pegawai3.setBonus(800000);

        // Using polymorphism to calculate salary and bonus
        PenghitunganGaji[] pegawai = new PenghitunganGaji[]{pegawai1, pegawai2, pegawai3};
        for (PenghitunganGaji p : pegawai) {
            p.cetakGaji();
            System.out.println("Gaji Pokok Setelah Perhitungan: " + p.hitungGajiPokok());
            System.out.println("Bonus Setelah Perhitungan: " + p.hitungBonus());
            System.out.println();
        }
    }
}
