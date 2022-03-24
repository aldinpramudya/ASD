import java.util.Scanner;
public class MainSum{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Program Hitung Keuntungan");
        System.out.println("Masukkan Jumlah Bulan :");
        int elm = sc.nextInt();

        Sum sm = new Sum(elm);
        System.out.println("=======================");
        for(int i = 0 ; i < sm.elemen ; i++){
            System.out.println("Masukkan Keuntungan Bulan Ke-" + (i+1) + " = ");
            sm.keuntungan[i] = sc.nextDouble();
        }
        System.out.println("Algoritma Brute Force");
        System.out.println("Total Keuntungan " + sm.elemen + "bulan adalah" + sm.totalBF(sm.keuntungan));
        System.out.println("Algoritma Divide and Conquer");
        System.out.println("Total Keuntungan " + sm.elemen + "bulan adalah" + sm.totalDC(sm.keuntungan, 0, sm.elemen-l));
    }
}