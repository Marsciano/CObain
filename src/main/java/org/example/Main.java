import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Mau Menampilkan Pesan Apa?");
        System.out.println("1. Keren");
        System.out.println("2. Hebat");
        int Pilihan = input.nextInt();
        input.nextLine();

        String Pesan;
        if (Pilihan == 1) {
            Pesan = "Keren";
        } else if (Pilihan == 2){
            Pesan = "Hebat";
        } else {
            Pesan = "Pilihan tidak dikenal ";
        }
        System.out.println("Masukan Nama");
        String nama = input.nextLine();
        System.out.println("Apa ajalah terserah");
        String keren = input.nextLine();
        System.out.println(Pesan + " " + nama + " " + keren);
        for (int i=0; i<=3; i++) {
            System.out.println( i );
        }
    }
}