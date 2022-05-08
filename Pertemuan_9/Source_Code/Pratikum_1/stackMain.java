package Pertemuan_9.Source_Code.Pratikum_1;
import java.util.Scanner;
public class stackMain {
    public static void menu(){
        System.out.println("Pilihan Menu : ");
        System.out.println("1. Push");
        System.out.println("2. Print");
        System.out.println("3. Pop");
        System.out.println("4. Peek");
        System.out.println("5. Get Min");
        System.out.println("---------------------");
    }
    public static void main(String[] args) {
        stack stk = new stack(5);
        Scanner sc = new Scanner(System.in);
        int pilihan;
        do{
            menu();
            pilihan = sc.nextInt();
            sc.nextLine();
            switch(pilihan){
                case 1 :
                    System.out.println("Jenis : ");
                    String jenis = sc.nextLine();
                    System.out.println("Warna : ");
                    String warna = sc.nextLine();
                    System.out.println("Merk : ");
                    String merk = sc.nextLine();
                    System.out.println("Ukuran : ");
                    String ukuran = sc.nextLine();
                    System.out.println("Harga : ");
                    double harga = sc.nextDouble();
                    pakaian p = new pakaian(jenis, warna, merk, ukuran, harga);
                    sc.nextLine();
                    stk.push(p);
                    break;
                case 2 :
                    stk.print();
                    break;
                case 3 :
                    stk.pop();
                    break;
                case 4 :
                    stk.peek();
                case 5 :
                    stk.getMin();
            }   
        } while (pilihan == 1 || pilihan == 2 || pilihan == 3 || pilihan == 4 || pilihan == 5);
    }
}
