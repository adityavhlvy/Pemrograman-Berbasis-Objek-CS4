//class untuk menjalankan program
public class Main {
    //method untuk menjalankan program
    public static void main(String[] args) {
        
        Karyawan karyawan1 = new Karyawan("Helmi Apriando", "Kendari", 25, "Manager");
        Gaji gaji1 = new Gaji(karyawan1.getJabatan(), karyawan1.getLamaBekerja());

        Karyawan karyawan2 = new Karyawan("Arya Ashari", "Palu", 15, "Manager");
        Gaji gaji2 = new Gaji(karyawan2.getJabatan(), karyawan2.getLamaBekerja());

        Karyawan karyawan3 = new Karyawan("Fenly Tannesa", "Bandung", 15, "Staff");
        Gaji gaji3 = new Gaji(karyawan3.getJabatan(), karyawan3.getLamaBekerja());

        Karyawan karyawan4 = new Karyawan("Talitha Allena Rizkiya", "Padang", 25, "Staff");
        Gaji gaji4 = new Gaji(karyawan4.getJabatan(), karyawan4.getLamaBekerja());

        Karyawan karyawan5 = new Karyawan("Fulan 1", "Nowhere", 15, "OB");
        Gaji gaji5 = new Gaji(karyawan5.getJabatan(), karyawan5.getLamaBekerja());

        Karyawan karyawan6 = new Karyawan("Fulan 2", "Nowhere", 25, "OB");
        Gaji gaji6 = new Gaji(karyawan6.getJabatan(), karyawan6.getLamaBekerja());

        karyawan1.printKaryawan(); gaji1.printGaji();
        karyawan2.printKaryawan(); gaji2.printGaji();
        karyawan3.printKaryawan(); gaji3.printGaji();
        karyawan4.printKaryawan(); gaji4.printGaji();
        karyawan5.printKaryawan(); gaji5.printGaji();
        karyawan6.printKaryawan(); gaji6.printGaji();
    }
}
