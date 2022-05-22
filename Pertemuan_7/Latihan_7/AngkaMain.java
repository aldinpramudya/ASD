package Pertemuan_7.Latihan_7;
import java.util.Scanner;
public class AngkaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        PencarianAngka aki = new PencarianAngka();
        int jumAngka = 10;

        System.out.println("=======================");
        System.out.println("Masukkan Data = ");
        for(int i = 0 ; i < jumAngka ; i++){
            System.out.print("Data Indeks " + i + " = ");
            int angka = s.nextInt();

            Angka a = new Angka(angka);
            aki.tambah(a);
        }

        System.out.println("Sorting Dengan Bubble Sort");
        aki.bubbleSort();
        aki.tampil();
        System.out.println("");
        System.out.println("Pencarian Data dengan Sequential Search");
        System.out.println("Masukkan Data : ");
        int cari = s.nextInt();
        int posisi = aki.SequentialSearch(cari);
        System.out.println("");
        aki.tampilPosisi(cari, posisi);
        
    }
}
