public class BelahKetupat implements Shape {
    public Double sisi, tinggi, hasil;

    public BelahKetupat(Double sisi, Double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    public BelahKetupat() {
    }

    public void hitungKeliling() {
        if (sisi == null || tinggi == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            hasil = sisi * 4;
            System.out.println("Keliling Belah Ketupat");
            System.out.println("Sisi     : " + sisi);
            System.out.println("Tinggi   : " + tinggi);
            System.out.println("Keliling : " + hasil);
            System.out.println();
        }
    }

    public void hitungLuas() {
        if (sisi == null || tinggi == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            hasil = sisi * tinggi;
            System.out.println("Luas Belah Ketupat");
            System.out.println("Sisi     : " + sisi);
            System.out.println("Tinggi   : " + tinggi);
            System.out.println("Luas     : " + hasil);
            System.out.println();
        }
    }

    public void hitungVolume() {
        System.out.println("Volume Belah Ketupat");
        System.out.println("Volume sebuah belah ketupat adalah datar tak terbatas, sehingga");
        System.out.println("Sisi     : " + sisi);
        System.out.println("Tinggi   : " + tinggi);
        System.out.println("Volume   : 0");
        System.out.println();
    }
}