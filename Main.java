import java.util.*;

class Halo {
    Petugas pt = new Petugas();

    public void hello() {
        System.out.println("--Selamat Datang di Perpustakaan--");
        System.out.println("");
        System.out.println("Petugas yang sedang bertugas adalah: ");

        Petugas.Karyawan();
    }
}

public class Main {
    private static int pilihan;

    public static void main(String[] args) {

        // Declare object
        Halo hl = new Halo();
        Murid sw = new Murid();
        // Buku bk = new Buku();
        Peminjaman pj = new Peminjaman();
        Petugas pt = new Petugas();

        // Main menu
        hl.hello();
        Scanner input = new Scanner(System.in);
        int menuPilihan;
        do {
            System.out.println("");
            System.out.println("--MENU PILIHAN PERPUSTAKAAN--");
            System.out.println("1. Pinjam Buku");
            System.out.println("2. Pengembalian Buku");
            System.out.println("3. Pembelian Buku");
            System.out.println("4. Daftar Buku");
            System.out.println("5. Keluar");
            System.out.println();

            System.out.println("--MASUKKAN BUKU PILIHAN ANDA--");
            menuPilihan = input.nextInt();

            switch (menuPilihan) {
                case 1:
                    sw.getSiswa();
                    System.out.println("");
                    pj.pinjambuku();
                    break;
                case 2:
                    sw.getSiswa();
                    System.out.println("");
                    pj.tampilBuku();
                    pj.kembalikanbuku();
                    break;

                case 3:
                    sw.getSiswa();
                    System.out.println("");
                    pj.tampilBuku();
                    pj.belibuku();
                    break;

                case 4:
                    sw.getSiswa();
                    System.out.println("");
                    pj.lihatbuku();
                    break;

                case 5:
                    System.out.println("--Terima kasih telah menggunakan layanan perpustakaan kami.--");
                    break;

                default:
                    System.out.println("Mohon masukkan kode yang valid.");
                    break;
            }
        } while (menuPilihan != 5);
    }
}
