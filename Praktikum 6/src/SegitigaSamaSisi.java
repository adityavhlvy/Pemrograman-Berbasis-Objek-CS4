public class SegitigaSamaSisi implements Shape {
    public Double sisi, tinggi, hasil;

    public SegitigaSamaSisi(Double sisi) {
        this.sisi = sisi;
    }

    public SegitigaSamaSisi() {
    }

    public void hitungKeliling() {
        if (sisi == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            hasil = hitungKelilingSegitiga(sisi);
        }
    }

    public void hitungLuas() {
        if (sisi == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            tinggi = Math.sqrt((sisi * sisi) - ((0.5 * sisi) * (0.5 * sisi)));
            hasil = (0.5) * sisi * tinggi;
            System.out.println("Luas Segitiga Sama Sisi");
            System.out.println("Sisi     : " + sisi);
            System.out.println("Tinggi   : " + tinggi);
            System.out.println("Luas     : " + hasil);
            System.out.println();
        }
    }

    public void hitungVolume() {
        System.out.println("Volume Segitiga Sama Sisi");
        System.out.println("Volume sebuah segitiga adalah datar tak terbatas, sehingga");
        System.out.println("Sisi     : " + sisi);
        System.out.println("Tinggi   : " + tinggi);
        System.out.println("Volume   : 0");
        System.out.println();
    }
}