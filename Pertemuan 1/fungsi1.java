import java.util.Scanner;
public class fungsi1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int menu;
        do{
            System.out.println("===================");
            System.out.println("Selamat Datang Di Toko Bunga Royale Garden");
            System.out.println("===================");
            System.out.println("Silahkan Pilih Menu : (1/2/3)");
            System.out.println("1. Menampilkan Stock Bunga");
            System.out.println("2. Menampilkan Seluruh Stock Bunga di Seluruh Cabang");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Menu anda :");
            menu = sc.nextInt();
            System.out.println("");
            switch(menu){
                case 1 : {
                    System.out.println("1. Menampilkan Stock Bunga");
                    menampilkanStok();
                }break;
                case 2 :{
                    System.out.println("2. Menampilkan Seluruh Stock Bunga di Seluruh Cabang");
                    menampilkanStokCabang();

                }break;
            }
        }while(menu > 0 && menu < 3);
    }
    static void menampilkanStok(){
        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        System.out.println("                    Algonema           Keladi       Alocasia           Mawar");
        System.out.println("RoyaleGarden1" + "\t\t|" + bunga[0][0] + "\t\t|" + bunga[0][1] + "\t\t|" + bunga[0][2] + "\t\t|" + bunga[0][3]);
        System.out.println("RoyaleGarden2" + "\t\t|" + bunga[1][0] + "\t\t|" + bunga[1][1] + "\t\t|" + bunga[1][2] + "\t\t|" + bunga[1][3] );
        System.out.println("RoyaleGarden3" + "\t\t|" + bunga[2][0] + "\t\t|" + bunga[2][1] + "\t\t|" + bunga[2][2] + "\t\t|" + bunga[2][3] );
        System.out.println("RoyaleGarden4" + "\t\t|" + bunga[3][0] + "\t\t|" + bunga[3][1] + "\t\t|" + bunga[3][2] + "\t\t|" + bunga[3][3] );
        System.out.println("");
    }

    static void menampilkanStokCabang(){
        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int algonema = 0, keladi = 0, alocasia = 0, mawar = 0, total;
        for(int i = 0; i < 4; i++){
            for(int a = 0; a < 4; a++){
                if(a == 0){
                    algonema += bunga[i][a];
                } else if(a == 1){
                    keladi += bunga[i][a];
                } else if(a == 2){
                    alocasia += bunga[i][a];
                } else{
                    mawar += bunga[i][a];
                }
            }
        }
        total = algonema + keladi + alocasia + mawar;
        System.out.println("Jumlah Bunga di Semua Cabang : " + total);
        System.out.println("Jumlah Bunga Algonema : " + algonema);
        System.out.println("Jumlah Bunga Keladi : " + keladi);
        System.out.println("Jumlah Bunga Alocasia : " + alocasia);
        System.out.println("Jumlah Bunga Mawar : " + mawar);
        System.out.println("");
    }

}
