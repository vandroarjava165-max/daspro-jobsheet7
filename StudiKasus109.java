import java.util.Scanner;
public class StudiKasus109 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tiket;
        int totalTiket = 0;
        int harga = 50000;
        double totalBayar;
        double totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            tiket = input.nextInt();

            if (tiket < 0) {
                System.out.println("Jumlah tiket tidak valid!");
                continue;
            }

            if (tiket == 0) {
                break;
            }

            totalBayar = tiket * harga;

            if (tiket > 10) {
                totalBayar = totalBayar * 0.85;
            } else if (tiket > 4) {
                totalBayar = totalBayar * 0.90;
            }

            totalTiket += tiket;
            totalPenjualan += totalBayar;
            System.out.println("Total harga: Rp " + totalBayar);

        } while (true);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        input.close();
    }
}