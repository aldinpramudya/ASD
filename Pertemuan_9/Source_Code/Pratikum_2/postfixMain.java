package Pertemuan_9.Source_Code.Pratikum_2;
import java.util.Scanner;
public class postfixMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P,Q;
        System.out.println("Masukkan Expresi Matematika (infix) : ");
        Q = sc.nextLine();
        Q.trim();
        Q = Q + ")";
        int total = Q.length();
        postfix post = new postfix(total);
        P = post.konversi(Q);
        System.out.println("Postfix : " + P);
    
        
    }
}
