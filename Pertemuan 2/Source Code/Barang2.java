import java.util.Scanner;
public class Barang2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Barang21 b1 = new Barang21();
        System.out.print("Masukkan Nama Barang : ");
        b1.nama = sc.nextLine();
        System.out.print("Masukkan Harga Satuan : ");
        b1.hargaSatuan = sc.nextInt();
        System.out.print("Masukkan Jumlah Barang : ");
        b1.jumlah = sc.nextInt();
        System.out.println("Data : ");
        b1.tampil();
        System.out.println("Harga Total = " + b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah));
        System.out.println("Harga Diskon = " + b1.hitungDiskon(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah)));
        System.out.println("Harga bayar = " + b1.hitungHargaBayar(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah),
        b1.hitungDiskon(b1.hitungHargaTotal(b1.hargaSatuan, b1.jumlah))));
    }
}

class Barang21{
    String nama;
    int hargaSatuan;
    int jumlah;

    void tampil(){
        System.out.println("Nama Barang = " + nama);
        System.out.println("Harga Satuan = Rp." + hargaSatuan);
        System.out.println("Jumlah barang = " + jumlah);
    }
    
    int hitungHargaTotal(int a, int b){
        int total;
        total=a*b;
        return total;
    }

    double hitungDiskon(int i){
        double hargaDiskon = 0;
        if(i>100000){
            hargaDiskon=i*0.10;
        } else if(i>=50000 && i<=100000){
            hargaDiskon=i*0.05;
        } else{
            hargaDiskon = 0;
        }
        return hargaDiskon;
    }
    double hitungHargaBayar(int z, double d){
        double hargaBayar = 0;
        hargaBayar = z-d;
        return hargaBayar;
    } 
}