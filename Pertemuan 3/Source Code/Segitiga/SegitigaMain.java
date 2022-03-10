import java.util.Scanner;
public class SegitigaMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Segitiga[] s1 = new Segitiga[4];
        for(int i = 0 ; i < 4 ; i++){
            s1[i] = new Segitiga();
            System.out.println("SEGITIGA KE-" + i);
            System.out.print("Masukkan Alas Segitiga : ");
            s1[i].alas = sc.nextInt();
            System.out.print("Masukkan Tinggi Segitiga : ");
            s1[i].tinggi = sc.nextInt();
        }

        for(int a = 0 ; a < 4 ; a++){
            System.out.println("sgArray ke-" + a + "\tAlas : " + s1[a].alas + " tinggi : " + s1[a].tinggi);
        }

        for (int j = 0 ; j < 4 ; j++){
            System.out.println("Luas Segitiga ke-" + j + ": " +  s1[j].hitungLuas());
            System.out.println("Keliling Segitiga ke-" + j + ": " + s1[j].hitungKeliling());
        }
    }
}

class Segitiga{
    int alas;
    int tinggi;

    void Segitiga(int a, int b){
        alas = a;
        tinggi = b;
    }

    int hitungLuas(){
        return (int) (0.5 *alas *tinggi);
    }

    int hitungKeliling(){
        return alas * (2 *tinggi);
    }
}

