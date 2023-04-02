public class JajarGenjang implements Shape {
    public Double panjang, lebar, tinggi, hasil;

    public JajarGenjang(Double panjang, Double lebar, Double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    public JajarGenjang() {

    }

    public void hitungKeliling() {
        if (panjang == null || lebar == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            hasil = 2 * (panjang + lebar);
            System.out.println("Keliling Jajar Genjang");
            System.out.println("Panjang  : " + panjang);
            System.out.println("Lebar    : " + lebar);
            System.out.println("Tinggi   : " + tinggi);
            System.out.println("Keliling : " + hasil);
            System.out.println();
        }
    }

    public void hitungLuas() {
        if (panjang == null || lebar == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            hasil = panjang * tinggi;
            System.out.println("Luas Jajar Genjang");
            System.out.println("Panjang  : " + panjang);
            System.out.println("Lebar    : " + lebar);
            System.out.println("Tinggi   : " + tinggi);
            System.out.println("Luas     : " + hasil);
            System.out.println();
        }
    }

    public void hitungVolume() {
        System.out.println("Volume Jajar Genjang");
        System.out.println("Volume sebuah jajar genjang adalah datar tak terbatas, sehingga");
        System.out.println("Luas Jajar Genjang");
        System.out.println("Panjang  : " + panjang);
        System.out.println("Lebar    : " + lebar);
        System.out.println("Tinggi   : " + tinggi);
        System.out.println("Volume   : 0");
        System.out.println();
    }
}