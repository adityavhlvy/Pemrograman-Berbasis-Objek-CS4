public abstract interface Shape {
    public void hitungKeliling();
    public void hitungLuas();
    public void hitungVolume();
    default Double hitungKelilingSegitiga(Double sisi){ 
        System.out.println("Keliling Segitiga Sama Kaki");
        Double hasil = sisi * 3;
        System.out.println("Sisi     : " + sisi);
        System.out.println("Keliling : " + hasil);
        System.out.println();
        return hasil;
    }
}
