import java.util.Scanner;
public class PacmanMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pacman p = new Pacman();
        p.x = 0;
        p.y = 0;
        System.out.println("===================");
        System.out.println("SELAMAT DATANG DI PROGRAM PACMAN");
        System.out.println("===================");
        System.out.println("Masukkan Batas Lebar Arena (x) = ");
        p.width = sc.nextInt();
        System.out.println("Masukkan Batas Panjang Arena (y) = ");
        p.height = sc.nextInt();

        for(;;){
            System.out.println("==========Cara Bermain==========");
            System.out.print("\nPilih Arah : \nKiri Tekan -> 1\nKanan Tekan -> 2\nAtas Tekan -> 3\nBawah Tekan -> 4\nExit tekan -> 5\nJawaban anda = ");
            int pilihan = sc.nextInt();
            if(p.x == 0 && pilihan == 1){
                System.out.println("Pacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == 0 && pilihan == 4){
                System.out.println("Pacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.x == p.width && pilihan == 2){
                System.out.println("Pacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            } else if (p.y == p.height && pilihan == 3) {
                System.out.println("Pacman Keluar Arena");
                p.printPosition(p.x, p.y);
                continue;
            }

            if (pilihan == 1){
                p.moveLeft(p.x);
                p.printPosition(p.x, p.y);
            } else if (pilihan == 2){
                p.moveRight(p.x);
                p.printPosition(p.x, p.y);
            } else if (pilihan == 3){
                p.moveUp(p.y);
                p.printPosition(p.x, p.y);
            } else if (pilihan == 4){
                p.moveDown(p.y);
                p.printPosition(p.x, p.y);
            } else{
                System.out.println("\nMohon Maaf input anda salah, atau anda sudah keluar\n");
                break;
            }
        }

    }
}

    class Pacman{
        int x,y,width,height;

        void moveLeft(int a){
            x -=1;
        }
        void moveRight(int a){
            x +=1;
        }
        void moveUp(int a){
            y +=1;
        }
        void moveDown(int a){
            y +=1;
        }
        void printPosition(int x, int y){
            System.out.println("Pacman berada di posisi (x,y) = " + x + " , " + y);
        }
    }
