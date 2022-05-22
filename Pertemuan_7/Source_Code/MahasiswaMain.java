package Pertemuan_7.Source_Code;
import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-----------------------");
        System.out.println("Masukan data Mahasiswa secara urut dari NIM terkecil");
        for(int i = 0 ; i < jumMhs ; i++){
            System.out.println("----------------");
            System.out.print("NIM\t :");
            int nim = s.nextInt();
            System.out.print("Nama\t :");
            String nama = s1.nextLine();
            System.out.print("Umur\t :");
            int umur = s.nextInt();
            System.out.print("IPK\t :");
            double ipk = s.nextDouble();

            MahasiswaNih m = new MahasiswaNih(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("---------------------");
        System.out.println("Data Keseluruhan Mahasiswa :");
        data.tampil();

        System.out.println("------------------------------");
        System.out.println("------------------------------");
        System.out.println("Pencarian Data : ");
        System.out.println("Masukkan NIM Mahasiswa yang Dicari : ");
        System.out.print("NIM : ");
        int cari = s.nextInt();
        /*System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSaerch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);*/
        System.out.println("===================");
        System.out.println("Menggunakan Binary Search");
        int posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

    }
}
