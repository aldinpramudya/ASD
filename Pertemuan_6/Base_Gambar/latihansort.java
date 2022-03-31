package Pertemuan_6.Base_Gambar;

public class latihansort {
    public static void main(String[] args) {
        int nama[] = new int[5];
        nama[0] = 4;
        nama[1] = 2;
        nama[2] = 6;
        nama[3] = 3;
        nama[4] = 5;

        System.out.println("hALO");
        
        for(int i = 0 ; i < nama.length-1 ; i++){
            for(int j = 1 ; j < nama.length-1 ; j++){
                if(nama[j] < nama [j-1]){
                    int tmp = nama[j];
                    nama[j] = nama[j-1];
                    nama[j-1] = tmp;
                }
            }
        }
    
    }
}
