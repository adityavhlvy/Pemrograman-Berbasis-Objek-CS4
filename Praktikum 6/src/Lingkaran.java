public class Lingkaran implements Shape {
    public Double diameter, hasil;
    public final Double pi = 3.14;

    public Lingkaran(Double diameter) {
        this.diameter = diameter;
    }

    public Lingkaran(){}

    public void hitungKeliling() {
        if(diameter == null){
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        }
        else{
            System.out.println("Keliling Lingkaran");
            hasil = pi * diameter;
            System.out.println("Diameter : " + diameter);
            System.out.println("Keliling : " + hasil);
            System.out.println();
        }
       
    }

    public void hitungLuas() {
        if(diameter == null){
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        }
        else{
            System.out.println("Luas Lingkaran");
            hasil = (0.25) * pi * (diameter * diameter);
            System.out.println("Diameter : " + diameter);
            System.out.println("Luas     : " + hasil);
            System.out.println();
        }
    }

    public void hitungVolume() {
        System.out.println("Volume Lingkaran");
        System.out.println("Volume sebuah lingkaran adalah datar tak terbatas, sehingga");
        System.out.println("Diameter : " + diameter);
        System.out.println("Volume   : 0");
        System.out.println();
    }
}