import java.util.Scanner;
public class InfoMahasiswa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        infoMahum[] m1 = new infoMahum[3];
        for(int i = 0 ; i < m1.length ; i++){
            m1[i] = new infoMahum();
        }
        for(int i = 0 ; i < m1.length ; i++){
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("Masukkan nama : ");
            m1[i].nama = sc.nextLine();
            System.out.print("Masukkan NIM : ");
            m1[i].nim = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Jenis kelamin : ");
            m1[i].JenisKelamin = sc.nextLine();
            System.out.print("Masukkan IPK : ");
            m1[i].ipk = sc.nextDouble();
            sc.nextLine();
        }
        for(int j = 0; j<m1.length ; j++){
            System.out.println("Data Mahasiswa ke-" + (j+1));
            System.out.println("Nama : " + m1[j].nama);
            System.out.println("NIM : " + m1[j].nim);
            System.out.println("Jenis Kelamin : " + m1[j].JenisKelamin);
            System.out.println("IPK : " + m1[j].ipk);
        }

    }
}

class infoMahum{
    int nim;
    double ipk;
    String nama ,JenisKelamin;
    void input(int a, double b, String c, String d){
        nim = a;
        ipk = b;
        nama = c;
        JenisKelamin = d;
    }
}
