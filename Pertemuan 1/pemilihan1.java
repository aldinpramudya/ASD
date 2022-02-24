import java.util.Scanner;
public class pemilihan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nilaiUTS, nilaiTugas, nilaiUAS;
        double nilaiTotal;
        String nilaiHuruf;
        System.out.println("----------------------");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("----------------------");
        System.out.print("Masukkan nilai Tugas :");
        nilaiTugas = sc.nextInt();
        System.out.print("Masukkan nilai UTS :");
        nilaiUTS = sc.nextInt();
        System.out.print("Masukkan nilai UAS :");
        nilaiUAS = sc.nextInt();
        nilaiTotal = ((0.2 * nilaiTugas) + (0.35 * nilaiUTS) + (0.45 *nilaiUAS));
        if(nilaiTotal > 80 && nilaiTotal <= 100){
            nilaiHuruf = ("A");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiTotal > 73 && nilaiTotal <= 80){
            nilaiHuruf = ("B+");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiTotal > 65 && nilaiTotal <= 73){
            nilaiHuruf = ("B");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if(nilaiTotal > 60 && nilaiTotal <= 65){
            nilaiHuruf = ("C+");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if (nilaiTotal > 50 && nilaiTotal <= 60){
            nilaiHuruf = ("C");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if (nilaiTotal > 39 && nilaiTotal <= 50){
            nilaiHuruf = ("D");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        } else if (nilaiTotal <= 39 ){
            nilaiHuruf = ("E");
            System.out.println("Nilai Akhir : " + nilaiTotal);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
        }
        System.out.println("===============================");
        if(nilaiTotal <=50 ){
            System.out.println("Mohon maaf, Anda Belum Lulus");
        } else{
            System.out.println("Selamat Anda Lulus !");
        }
    }
}
