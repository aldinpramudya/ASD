import java.util.Scanner;
public class BangunRuangMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Balok[] b1 = new Balok[3];
        Kerucut[] k1 = new Kerucut[3];
        Tabung[] t1 = new Tabung[3];
        System.out.println("=======================");
        System.out.println("Program Menghitung Volume dan Luas");
        System.out.println("=======================");
        System.out.println("Pilih Salah Satu Bangun Ruang (1/2/3):");
        System.out.println("1. Balok");
        System.out.println("2. Kerucut");
        System.out.println("3. Tabung");
        System.out.println("4. Keluar Program");
        System.out.print("Pilihan Anda : ");
        pilihan = sc.nextInt();
            switch(pilihan){
                case 1 : {
                    System.out.println("======Bangun Balok======");
                    for(int i =0; i<3 ; i++){
                        b1[i] = new Balok();
                        System.out.println("Balok ke-" + (i+1));
                        System.out.print("Masukkan Panjang = ");
                        b1[i].panjang = sc.nextInt();
                        System.out.print("Masukkan Lebar = ");
                        b1[i].lebar = sc.nextInt();
                        System.out.print("Masukkan Tinggi = ");
                        b1[i].tinggi = sc.nextInt();
                    }
                    for (int j=0 ; j<3 ; j++){
                        System.out.println("Luas Balok ke-" + (j+1) + ": " + b1[j].hitungLuas());
                        System.out.println("Volume Balok ke-" + (j+1) + ": " + b1[j].hitungVolume());
                    }
                }break;
                case 2 : {
                    System.out.println("======Bangun Kerucut======");
                    for(int i=0 ; i<3 ; i++){
                        k1[i] = new Kerucut();
                        System.out.println("Kerucut ke-" + (i+1));
                        System.out.print("Masukkan Jari-Jari = ");
                        k1[i].jariJari = sc.nextInt();
                        System.out.print("Masukkan Tinggi = ");
                        k1[i].tinggi = sc.nextInt();
                        System.out.print("Masukkan Garis Pelukis = ");
                        k1[i].garisPelukis = sc.nextInt();
                    }
                    for(int j =0 ; j<3 ; j++){
                        System.out.println("Luas Kerucut ke-" + (j+1) + ": " + k1[j].hitungLuas());
                        System.out.println("Volume Kerucut ke-" + (j+1) + ": " + k1[j].hitungVolume());
                    }
                }break;
                case 3 : {
                    System.out.println("======Bangun Tabung======");
                    for(int i=0 ; i<3 ; i++){
                        t1[i] = new Tabung();
                        System.out.println("Tabung ke-" + (i+1));
                        System.out.print("Masukkan Jari-jari = ");
                        t1[i].jariJari = sc.nextInt();
                        System.out.print("Masukkan Tinggi = ");
                        t1[i].tinggi = sc.nextInt();
                    }
                    for(int j = 0 ; j<3 ; j++){
                        System.out.println("Luas Tabung ke-" + (j+1) + ": " + t1[j].hitungLuas());
                        System.out.println("Volume Tabung ke-" + (j+1) + ": " + t1[j].hitungVolume());
                    }
                }break;
            }
    }
}

class Balok{
    int panjang, lebar, tinggi;
    void Balok(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    int hitungLuas(){
        return 2*(panjang*lebar + panjang+tinggi + lebar*tinggi);
    }

    int hitungVolume(){
        return panjang * lebar * tinggi;
    }
}

class Kerucut{
    double phi = 3.14;
    int jariJari, tinggi, garisPelukis;
    void Kerucut(int j, int t, int gp){
        jariJari = j;
        tinggi = t;
        garisPelukis = gp;
    }

    int hitungLuas(){
        int luasKerucut;
        luasKerucut = (int)phi * jariJari * (jariJari + garisPelukis);
        return luasKerucut;
    }

    int hitungVolume(){
        double volumeKerucut;
        volumeKerucut = 0.33 * phi * jariJari * jariJari * tinggi;
        return (int) volumeKerucut;
    }
}

class Tabung{
    double phi = 3.14;
    int jariJari, tinggi;
    void  Tabung(int a, int b){
        jariJari = a;
        tinggi = b;
    }

    int hitungLuas(){
        double luasTabung;
        luasTabung = 2 * phi * jariJari *  (jariJari + tinggi);
        return (int) luasTabung;
    }

    int hitungVolume(){
        double volumeTabung;
        volumeTabung = phi * jariJari * jariJari * tinggi;
        return (int) volumeTabung;
    }
}