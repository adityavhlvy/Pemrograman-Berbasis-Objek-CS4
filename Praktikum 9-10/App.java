abstract class ItemMakanan {
    protected int harga;
    protected int jumlah;

    public abstract double hitungSubTotal();
}

class Makanan extends ItemMakanan {
    public double hitungSubTotal() {
        return harga * jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

class Minuman extends ItemMakanan {
    public double hitungSubTotal() {
        return harga * jumlah;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
}

interface Diskon {
    double hitungDiskon(double totalHarga);
}

class DiskonPersen implements Diskon {
    private double persenDiskon;

    public void setPersenDiskon(double persenDiskon) {
        this.persenDiskon = persenDiskon;
    }

    public double hitungDiskon(double totalHarga) { 
        return (totalHarga * (persenDiskon/100));
    }
}

class Pesanan {
    private ItemMakanan[] daftarItem;
    private Diskon diskon;
    private double pajak;

    public double hitungTotalHarga() {
        double totalHarga = 0;
        for (ItemMakanan item : daftarItem) {
            totalHarga += (item.hitungSubTotal());
        }
        System.out.println("Total harga : " + totalHarga);
        return totalHarga;
    }

    public double hitungTotalHargaSetelahDiskon() {
        double totalHarga = hitungTotalHarga();
        double diskon = this.diskon.hitungDiskon(totalHarga);
        System.out.println("Diskon persen : " + diskon);
        System.out.println("Total harga setelah diskon : " + (totalHarga - diskon));
        return totalHarga - diskon;
    }

    public double hitungTotalHargaSetelahDiskonDanPajak() {
        double totalHargaSetelahDiskon = hitungTotalHargaSetelahDiskon();
        double totalHargaSetelahPajak = totalHargaSetelahDiskon - (totalHargaSetelahDiskon * pajak);
        return totalHargaSetelahPajak;
    }

    public void setDaftarItem(ItemMakanan[] daftarItem) {
        this.daftarItem = daftarItem;
    }

    public void setDiskon(Diskon diskon) {
        this.diskon = diskon;
    }

    public void setPajak(double pajak) {
        this.pajak = pajak;
    }
}

public class App {
    public static void main(String[] args) {
        Makanan makanan1 = new Makanan();
        makanan1.setHarga(50);
        makanan1.setJumlah(2);

        Minuman minuman1 = new Minuman();
        minuman1.setHarga(20);
        minuman1.setJumlah(3);

        DiskonPersen diskonPersen = new DiskonPersen();
        diskonPersen.setPersenDiskon(10);

        Pesanan pesanan1 = new Pesanan();
        pesanan1.setDaftarItem(new ItemMakanan[] { makanan1, minuman1 });
        pesanan1.setDiskon(diskonPersen);
        pesanan1.setPajak(0.1);

        double totalHargaSetelahDiskonDanPajak = pesanan1.hitungTotalHargaSetelahDiskonDanPajak();
        System.out.println("Total harga setelah diskon dan pajak: " + totalHargaSetelahDiskonDanPajak);
    }
}
