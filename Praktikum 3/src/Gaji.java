
public class Gaji {
    private double manager = 10000000;
    private double staff = 5000000;
    private double ob = 2000000;
    private double gaji;

    public Gaji(String jabatan, int lamaBekerja) {
        if (jabatan.equals("Manager")) {
            gaji = manager;
        } else if (jabatan.equals("Staff")) {
            gaji = staff;
        } else if (jabatan.equals("OB")) {
            gaji = ob;
        }

        if (gaji > 0) {
            gaji *= 0.8; // potong pajak 20%
            gaji *= 1.1; // tambahkan bonus 10%
            if (lamaBekerja > 24) {
                gaji *= 1.2; // tambahkan 20% jika lama bekerja > 24 bulan
            }
        }
    }

    public double getGaji() {
        return gaji;
    }

    public void printGaji() {
        System.out.println("Gaji Akhir    : " + getGaji());
        System.out.println();
    }
}
