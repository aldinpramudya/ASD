import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("================");
            System.out.println("Selamat Datang Di Program Menghitung Rumus");
            System.out.println("================");
            System.out.println("Silahkan pilih salah satu menu dibawah(1/2/3/4) : ");
            System.out.println("1. Menghitung Kecepatan");
            System.out.println("2. Menghitung Jarak");
            System.out.println("3. Menghitung Waktu");
            System.out.println("4. Keluar");
            System.out.println("Pilihan Anda : ");
            menu = sc.nextInt();
            switch(menu){
                case 1 :{
                    menghitungKecepatan();
                } break;
                case 2 :{
                    menghitungjarak();
                } break;
                case 3 :{
                    menghitungWaktu();
                }break;
                default :{
                    System.out.println("Terimakasih Telah Menggunakan Program Ini !");
                }
            }
        }while(menu > 0 && menu < 4);
    }
    static void menghitungKecepatan(){
        Scanner sc = new Scanner(System.in);
        double kecepatan;
        int jarak, waktu;
        System.out.println("=================");
        System.out.println("Selamat Datang Di Menu Menghitung Kecepatan");
        System.out.println("=================");
        System.out.print("Silahkan Masukkan Jarak(Kilometer) yang anda Ketahui : ");
        jarak = sc.nextInt();
        System.out.print("Silahkan Masukkan Waktu(Jam) yang anda Ketahui : ");
        waktu = sc.nextInt();
        kecepatan = jarak/waktu;
        System.out.println("Kecepatan hasil perhitungan : " + kecepatan + " Km/Jam");
        System.out.println("");

    }
    static void menghitungjarak(){
        Scanner sc = new Scanner(System.in);
        double jarak;
        int kecepatan, waktu;
        System.out.println("=================");
        System.out.println("Selamat Datang di Menu Menghitung Jarak");
        System.out.println("=================");
        System.out.print("Silahkan Masukkan kecepatan(Km/Jam) yang anda ketahui : ");
        kecepatan = sc.nextInt();
        System.out.print("Silahkan Masukkan waktu(jam) yang anda ketahui : ");
        waktu = sc.nextInt();
        jarak = kecepatan * waktu;
        System.out.println("Jarak hasil perhitungan : " + jarak + " Km");
        System.out.println("");
    }
    static void menghitungWaktu(){
        Scanner sc = new Scanner(System.in);
        double waktu;
        int kecepatan, jarak;
        System.out.println("=================");
        System.out.println("Selamat Datang di Menu Menghitung Jarak");
        System.out.println("=================");
        System.out.print("Silahkan Masukkan kecepatan(Km/Jam) yang anda ketahui : ");
        kecepatan = sc.nextInt();
        System.out.print("Silahkan Masukkan jarak(Km) yang anda ketahui : ");
        jarak = sc.nextInt();
        waktu = jarak/kecepatan;
        System.out.println("Waktu hasil perhitungan : " + waktu + " jam");
        System.out.println("");
    }
}
