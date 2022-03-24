import java.util.Scanner;
public class Pratikum5Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("===Pemilihan Suara Ketua BEM===");
        System.out.println("Masukkan Banyak Suara :");
        int suara = sc.nextInt();
        Pratikum5 p5 = new Pratikum5(suara);
        sc.nextLine();
        for(int i = 0 ; i < suara ; i++){
            System.out.println("Masukkan Nama/Suara ke- " + (i+1) + " = ");
            p5.kandidat[i] = sc.nextLine();
        }
        int hasil =  p5.ModusArray(p5.kandidat, 0, suara, 0, 0);
        System.out.println(" Mayoritas Jumlah Suara adalah : " + p5.kandidat[hasil]);
    }
}
