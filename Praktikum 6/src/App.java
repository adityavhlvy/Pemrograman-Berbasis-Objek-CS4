public class App {
    public static void main(String[] args) throws Exception {
        Lingkaran lingkaran = new Lingkaran(10.0);
        lingkaran.hitungKeliling();
        lingkaran.hitungLuas();
        lingkaran.hitungVolume();

        SegitigaSamaSisi segitiga = new SegitigaSamaSisi(10.0);
        segitiga.hitungKeliling();
        segitiga.hitungLuas();
        segitiga.hitungVolume();

        BelahKetupat belahKetupat = new BelahKetupat(10.0, 5.0);
        belahKetupat.hitungKeliling();
        belahKetupat.hitungLuas();
        belahKetupat.hitungVolume();

        JajarGenjang jajarGenjang = new JajarGenjang(10.0, 8.0, 5.0);
        jajarGenjang.hitungKeliling();
        jajarGenjang.hitungLuas();
        jajarGenjang.hitungVolume();

        PrismaSegitiga prismaSegitiga = new PrismaSegitiga(10.0, 20.0);
        prismaSegitiga.hitungKeliling();
        prismaSegitiga.hitungLuas();
        prismaSegitiga.hitungVolume();

    }
}
