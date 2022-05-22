package Pertemuan_7.Source_Code;

public class MahasiswaNih {
    int nim;
    String nama;
    int umur;
    double ipk;

    MahasiswaNih(int ni, String n, int u, double i){
        nim = ni;
        nama = n;
        umur = u;
        ipk = i;
    }

    void tampil(){
        System.out.println("NIM = " + nim);
        System.out.println("Nama = " + nama);
        System.out.println("Umur = " + umur);
        System.out.println("IPK = " + ipk);
    }
}
