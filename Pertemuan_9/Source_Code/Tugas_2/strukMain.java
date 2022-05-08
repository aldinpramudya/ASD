package Pertemuan_9.Source_Code.Tugas_2;
import java.util.Scanner;
public class strukMain {
    public static void menu(){
        System.out.println("====Menu Struck=====");
        System.out.println("Pilihan Menu");
        System.out.println("1. Masukkan Data Struk");
        System.out.println("2. Tampil Struk");
        System.out.println("3. Tampil Struk Teratas");
        System.out.println("4. Kosongkan Stack");
        System.out.println("5. Tukarkan 5 Struk Dengan Kupon");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Banyak Struk :");
        int jumStruk = sc.nextInt();
        stackStruk ss = new stackStruk(jumStruk);
        int pilihan;
        do{
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan){
                case 1 :
                    System.out.println("Masukkan ID Struk : ");
                    String noTrans = sc.nextLine();
                    System.out.println("Masukkan Tanggal Pembelian : ");
                    String tanggal = sc.nextLine();
                    System.out.println("Masukkan Jumlah Barang : ");
                    String jumlah = sc.nextLine();
                    System.out.println("Masukkan Harga Pembelian : ");
                    double harga = sc.nextDouble();

                    struk st = new struk(noTrans, tanggal, jumlah, harga);
                    sc.nextLine();
                    ss.push(st);
                    break;
                
                case 2 :
                    ss.print();
                    break;
                case 3 :
                    ss.peek();
                    break;
                case 4 : 
                    ss.clear();
                    break;
                case 5 :
                    ss.pop();
                    ss.pop();
                    ss.pop();
                    ss.pop();
                    ss.pop();
                    ss.print();
                    System.out.println("Penukaran Kupon Berhasil !");
                    break;
            }
        } while(pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5);
    }
}
