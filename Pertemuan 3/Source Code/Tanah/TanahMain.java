import java.util.Scanner;
public class TanahMain{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlah;
        System.out.println("======================");
        System.out.println("Selamat Datang di Program Menghitung Tanah");
        System.out.println("======================");
        System.out.println("Masukkan jumlah tanah yang akan dihitung :");
        jumlah = input.nextInt();
        System.out.println();
        Tanah[] t0 = new Tanah[jumlah];

        for(int i = 0 ; i < t0.length ; i++){
            int p,l;
            System.out.println("Tanah ke-" + (i+1));
            System.out.println("Masukkan Panjang Tanah = ");
            p = input.nextInt();
            System.out.println("Masukkan Lebar Tanah = ");
            l = input.nextInt();
            t0[i] = new Tanah(p,l);

        }
        int i = 0;
        int j = 0;
        for (int a = 0 ; a<t0.length ; a++){
            if(t0[a].LuasTanah()>i){
                i = t0[a].LuasTanah();
                j = a+1;
            }
        }
        for (int t = 0 ; t < t0.length ; t++){
            System.out.println("Luas Bidan Tanah ke-" + (t+1) + "= " + t0[t].LuasTanah());
        }
        System.out.println("Bidang Tanah Yang terluas adalah bidang ke-" + j);

    }

}

class Tanah{
    int panjang, lebar;
    public Tanah(int p, int l){
        panjang = p;
        lebar = l;
    }
    int LuasTanah(){
        return panjang*lebar;
    }
}