//Kelas Hewan
public class Hewan{
    
    //Atribut dalam kelas Hewan
    private String nama, jenis;
    private int jumlahKaki;

    public void setHewan(String nama, String jenis, int jumlahKaki){
        this.nama = nama;
        this.jenis = jenis;
        this.jumlahKaki = jumlahKaki;
    }

    protected String getNama(String nama){
        return this.nama = nama;
    }

    protected String getJenis(String jenis){
        return this.jenis = jenis;
    }

    protected int getJumlahKaki(int jumlahKaki){
        return this.jumlahKaki = jumlahKaki;    
    }

    public void show(){
        System.out.println();
        System.out.println("Nama hewan  : " + this.nama);
        System.out.println("Jenis hewan : " + this.jenis);
        System.out.println("Jumlah kaki : " + this.jumlahKaki);
    }
}
