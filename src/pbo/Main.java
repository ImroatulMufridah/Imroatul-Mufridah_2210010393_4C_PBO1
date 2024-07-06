package pbo;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
            //io sederhana
            Scanner scanner = new Scanner(System.in);
            // array untuk menyimpan data kue
            KueDetail[] kue = new KueDetail[2];
            // perulangan untuk mengisi data kue
            for (int i = 0; i < kue.length; i++) {
                System.out.println("Masukkan Pesanan ke " + (i + 1));
                System.out.print("Nama Pembeli : ");
                String nama = scanner.nextLine();
                System.out.print("Kode Kue (contoh: 20NT34): ");
                String kodeKue = scanner.nextLine();

                kue[i] = new KueDetail(nama, kodeKue);
            }
            // menampilkan informasi kue
            System.out.println("\nData Pesanan ");
            for (KueDetail data : kue) {
                System.out.println("====================================");
                System.out.println("Detail Pesanan ");
                System.out.println(data.tampilkanInfo());
            }
    }
    
}




