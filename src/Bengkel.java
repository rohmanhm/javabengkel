import java.util.Scanner;

/**
 * DO NOT REMOVE THIS LINE
 * Credit to @rohmanhm
 *
 */

public class Bengkel {
    ProdukLayanan produkLayanan[] = new ProdukLayanan[] {
        new ProdukLayanan("Oli", 2500),
        new ProdukLayanan("Minyak", 4500),
        new ProdukLayanan("Ban", 10500),
    };

    int total;

    public static void main(String[] args) {
        Bengkel bengkel = new Bengkel();
        bengkel.pilihProdukLayanan();
    }

    public void pilihProdukLayanan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih produk:");
        for (int i = 0; i < produkLayanan.length; i++) {
            ProdukLayanan pl = produkLayanan[i];
            System.out.println(i+1 + ". " + pl.nama + " - Rp. " + pl.harga);
        }

        System.out.print("Masukkan pilihan produk dan layanan: ");

        int produkLayananDipilih = input.nextInt();

        ProdukLayanan produkLayananTerpilih = produkLayanan[produkLayananDipilih-1];
        System.out.println("");
        System.out.println("Anda memilih " + produkLayananTerpilih.nama + " @ Rp. " + produkLayananTerpilih.harga);
        System.out.println("");

        this.total += produkLayananTerpilih.harga;

        this.printTotal();

        this.tanyaPilihProdukLayananLain();
    }

    public void tanyaPilihProdukLayananLain() {
        Scanner input = new Scanner(System.in);

        System.out.println("Apakah anda mau memilih produk layanan yang lain?");
        System.out.println("1. Ya       2. Tidak");
        System.out.print("Jawab: ");
        int jawaban = input.nextInt();

        if (jawaban == 1) {
            this.pilihProdukLayanan();
        } else if (jawaban == 2) {
            System.out.println("");
            System.out.println("Terima kasih sudah berbelanja.");
            this.printTotal();
        } else {
            System.out.println("Kami tidak menemukan jawaban yg anda maksud.");
            this.tanyaPilihProdukLayananLain();
        }
    }

    public void printTotal() {
        System.out.println("Total yang harus dibayar: Rp. " + this.total);
    }
}
