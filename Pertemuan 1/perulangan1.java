import java.util.Scanner;
public class perulangan1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nim, banyakUlang;
        int hari = 0;
        System.out.println("NIM anda : ");
        nim = sc.nextInt();
        banyakUlang = nim%100;
        if(banyakUlang < 10){
            System.out.println(banyakUlang +=10);
        } else{
            System.out.println("Banyak Perulangan : " + banyakUlang);
        }
        for(int i = 0; i < banyakUlang; i++){
            hari++;
            if(hari>=7){
                hari=0;
            }
            if(hari%7 == 0){
                System.out.print("Minggu ");
            } else if(hari%6 == 0){
                System.out.print("Sabtu ");
            } else if(hari%5 == 0){
                System.out.print("Jumat ");
            } else if(hari%4 == 0){
                System.out.print("Kamis ");
            } else if(hari%3 == 0){
                System.out.print("Rabu ");
            } else if(hari%2 == 0){
                System.out.print("Selasa ");
            } else{
                System.out.print("Senin ");
            }
        }
    
    }
}
