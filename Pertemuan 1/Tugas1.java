import java.util.Scanner;
public class Tugas1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int beratAni, beratBudi, beratBina, beratCita;
        int hargaAni, hargaBudi, hargaBina, hargaCita;
        double total;
        int tarif = 4500;
        double diskon = 0.05;
        System.out.println("Masukkan Berat Laundry Ani : ");
        beratAni = sc.nextInt();
        System.out.println("Masukkan Berat Laundry Budi : ");
        beratBudi = sc.nextInt();
        System.out.println("Masukkan Berat Laundry Bina : ");
        beratBina = sc.nextInt();
        System.out.println("Masukkan Berat Laundry Cita : ");
        beratCita = sc.nextInt();
        System.out.println("Harga per Customer : ");
        hargaAni = beratAni * tarif;
        hargaBudi = (int) (beratBudi * (tarif * diskon));
        hargaBina = beratBina * tarif;
        hargaCita = (int) (beratCita * (tarif * diskon));
        total = hargaAni + hargaBina + hargaBudi + hargaCita;
        System.out.println("Biaya yang dibayar Ani : " + hargaAni);
        System.out.println("Biaya yang dibayar Budi : " + hargaBudi);
        System.out.println("Biaya yang dibayar Bina : " + hargaBina);
        System.out.println("Biaya yang dibayar Cita : " + hargaCita);
        System.out.println("Pendapatan Smile Laundry: " + total);
        
    }
}
