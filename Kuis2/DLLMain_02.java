package Kuis2;
import java.util.Scanner;
public class DLLMain_02 {
     
    public static void menu(){
        System.out.println("****************************");
        System.out.println("Data Buku Perpustakaan");
        System.out.println("****************************");
        System.out.println(" ");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println(" ");
    }

    public static void main(String[] args) throws Exception{
        Scanner data = new Scanner(System.in);
        DLL_02 dll = new DLL_02();
        int pilihan;
        String buku;
        do{ 
            menu();
            System.out.println("Pilihan Menu anda (1/2/3/4/5) : ");
            pilihan = data.nextInt();
            data.nextLine();
            switch(pilihan){
                case 1 :
                    System.out.println("============");
                    System.out.println("Masukkan Judul Buku : ");
                    System.out.println("============");
                    buku = data.nextLine();
                    dll.addFirst(buku);
                    System.out.println(" ");
                    break;
                case 2 :
                    dll.removeFirst();
                    System.out.println("Buku Tumpukan teratas Telah diambil");
                    System.out.println(" ");
                    break;
                case 3 :
                    System.out.println("============");
                    System.out.println("Cek Buku Teratas");
                    System.out.println("============");
                    dll.getFirst();
                    System.out.println(" ");
                    break;
                case 4 :
                    System.out.println("============");
                    System.out.println("Cetak Seluruh Buku");
                    System.out.println("============");
                    System.out.println(" ");
                    dll.print();
                    break;
            }
        }while (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4);
    }
}
