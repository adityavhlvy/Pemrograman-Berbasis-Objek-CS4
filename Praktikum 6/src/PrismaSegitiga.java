public class PrismaSegitiga implements Shape {
    public Double sisi, tinggi, tinggiPrisma, hasil;

    public PrismaSegitiga(Double sisi, Double tinggiPrisma) {
        this.sisi = sisi;
        this.tinggiPrisma = tinggiPrisma;
    }

    public PrismaSegitiga() {
    }

    public void hitungKeliling() {
        if (sisi == null || tinggiPrisma == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            tinggi = (Math.sqrt((sisi * sisi) - ((0.5 * sisi) * (0.5 * sisi))));
            hasil = (2 * (3 * sisi)) + (3 * tinggiPrisma);
            System.out.println("Keliling Prisma Segitiga");
            System.out.println("Sisi            : " + sisi);
            System.out.println("Tinggi          : " + tinggi);
            System.out.println("Tinggi Prisma   : " + tinggiPrisma);
            System.out.println("Keliling        : " + hasil);
            System.out.println();
        }
    }

    public void hitungLuas() {
        if (sisi == null || tinggiPrisma == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            tinggi = (Math.sqrt((sisi * sisi) - ((0.5 * sisi) * (0.5 * sisi))));
            hasil = (2 * (0.5 * sisi * tinggi)) + (3 * (sisi * tinggiPrisma));
            System.out.println("Luas Prisma Segitiga");
            System.out.println("Sisi            : " + sisi);
            System.out.println("Tinggi          : " + tinggi);
            System.out.println("Tinggi Prisma   : " + tinggiPrisma);
            System.out.println("Luas            : " + hasil);
            System.out.println();
        }
    }

    public void hitungVolume() {
        if (sisi == null || tinggiPrisma == null) {
            System.out.println("Bentuk tidak terdefenisi");
            System.out.println();
        } else {
            tinggi = (Math.sqrt((sisi * sisi) - ((0.5 * sisi) * (0.5 * sisi))));
            hasil = ((0.5) * sisi * tinggi) * tinggiPrisma;
            System.out.println("Volume Prisma Segitiga");
            System.out.println("Sisi            : " + sisi);
            System.out.println("Tinggi          : " + tinggi);
            System.out.println("Tinggi Prisma   : " + tinggiPrisma);
            System.out.println("Volume          : " + hasil);
            System.out.println();
        }
    }
}