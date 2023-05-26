abstract class ItemMakanan {
    protected int harga;
    protected int jumlah;

    public abstract double hitungSubTotal();
}

class Makanan extends ItemMakanan {
    public double hitungSubTotal() {
        //isi sendiri
    }

    public void setHarga(int harga) {
        //isi sendiri
    }

    public void setJumlah(int jumlah) {
        //isi sendiri
    }
}

class Minuman extends ItemMakanan {
    public double hitungSubTotal() {
        //isi sendiri
    }

    public void setHarga(int harga) {
        //isi sendiri
    }

    public void setJumlah(int jumlah) {
        //isi sendiri
    }
}

interface Diskon {
    double hitungDiskon(double totalHarga);
}

class DiskonPersen implements Diskon {
    private double persenDiskon;

    public void setPersenDiskon(double persenDiskon) {
        //isi sendiri
    }

    public double hitungDiskon(double totalHarga) {
        //isi sendiri
    }
}

class Pesanan {
    private ItemMakanan[] daftarItem;
    private Diskon diskon;
    private double pajak;

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (ItemMakanan item : daftarItem) {
            totalHarga += //isi sendiri
        }
        //isi sendiri
    }

    public double hitungTotalHargaSetelahDiskon() {
        double totalHarga = //isi sendiri
        double diskon = //isi sendiri
        //isi sendiri
    }

    public double hitungTotalHargaSetelahDiskonDanPajak() {
        double totalHargaSetelahDiskon = //isi sendiri
        double totalHargaSetelahPajak = //isi sendiri
        //isi sendiri
    }

    public void setDaftarItem(ItemMakanan[] daftarItem) {
        this.daftarItem = //isi sendiri
    }

    public void setDiskon(Diskon diskon) {
        this.diskon = //isi sendiri
    }

    public void setPajak(double pajak) {
        this.pajak = //isi sendiri
    }
}

public class kunci_jawaban {
    public static void main(String[] args) {
        Makanan makanan1 = //isi sendiri
        makanan1.setHarga(50);
        makanan1.setJumlah(2);

        Minuman minuman1 = //isi sendiri
        minuman1.setHarga(20);
        minuman1.setJumlah(3);

        DiskonPersen diskonPersen = //isi sendiri
        diskonPersen.setPersenDiskon(10);

        Pesanan pesanan1 = //isi sendiri
        pesanan1.setDaftarItem(new ItemMakanan[] { makanan1, minuman1 });
        pesanan1.setDiskon(diskonPersen);
        pesanan1.setPajak(0.1);

        double totalHargaSetelahDiskonDanPajak = pesanan1.hitungTotalHargaSetelahDiskonDanPajak();
        System.out.println("Total harga setelah diskon dan pajak: " + totalHargaSetelahDiskonDanPajak);
    }
}
