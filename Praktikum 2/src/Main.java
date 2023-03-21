public class Main{
    public static void main(String[] args) throws Exception {
        
        //Objek dalam kelas Hewan dengan nama daftarHewan1
        Hewan daftarHewan1 = new Hewan();
        daftarHewan1.getNama("Kuoka");
        daftarHewan1.getJenis("Mamalia");
        daftarHewan1.getJumlahKaki(4);

        //Objek dalam kelas Hewan dengan nama daftarHewan2
        Hewan daftarHewan2 = new Hewan();
        daftarHewan2.getNama("Axolotl");
        daftarHewan2.getJenis("Amfibi");
        daftarHewan2.getJumlahKaki(4);

        //Objek dalam kelas Hewan dengan nama daftarHewan3
        Hewan daftarHewan3 = new Hewan();
        daftarHewan3.getNama("Beruang air");
        daftarHewan3.getJenis("Tardigrada");
        daftarHewan3.getJumlahKaki(8);
       
        System.out.println("Daftar Hewan");
        daftarHewan1.show();
        daftarHewan2.show();
        daftarHewan3.show();
        System.out.println();
    }
}
