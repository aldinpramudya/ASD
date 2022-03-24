import java.util.Scanner;
public class pangkatMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("======================");
        System.out.print("Masukkan jumlah elemen yang akan dihitung : ");
        int elemen = sc.nextInt();
        pangkat [] png = new pangkat[elemen];

        for (int  i = 0; i < elemen ; i++){
            System.out.println("Masukkan nilai yang akan dipangkatkan ke-" + (i+1) + " : ");
            int nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke-" + (i+1) + " : ");
            int pangkat = sc.nextInt();
            png[i] = new pangkat(nilai, pangkat);
        }
        int pilihan;
        do{
            System.out.println("Pilih Salah Satu Metode Untuk Menyelesaikan Pangkat : \n1. Brute Force \n2. Divide And Conquer \n3. Keluar \nPilihan Anda : (1/2/3)");
            pilihan = sc.nextInt();
            switch(pilihan){
                case 1 : {
                    System.out.println("=======================");
                    System.out.println("Hasil Pangkat dengan Brute Force");
                    for(int i = 0 ; i  < elemen ; i++){
                        System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                    }
                    System.out.println("=======================");
                }break;
                case 2 : {
                    System.out.println("=======================");
                    System.out.println("Hasil Pangkat dengan Divide and Conquer");
                    for(int i = 0 ; i < elemen ; i++){
                        System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah : " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                    }
                    System.out.println("=======================");
                }break;
            }
        }while (pilihan > 0 && pilihan < 3);
    }
}


