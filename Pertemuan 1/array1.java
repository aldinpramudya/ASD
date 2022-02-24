public class array1 {
    public static void main(String[] args){
        int [][] bunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        int jumlahBunga = 0;
        int pendapatan;
        for(int i = 0 ; i<bunga[0].length ; i++){
            jumlahBunga = 0;
            for(int a = 0 ; a<bunga.length ; a++){
                jumlahBunga += bunga[a][i];
            }
            System.out.println("Jumlah Bunga " + "ke-" + (i+1) + ": " + jumlahBunga);
        }
        pendapatan = ((10-1)* 75000) + ((5-2)*50000) + (15*60000) + ((7-5)*10000);
        System.out.println("Total Pendapatan Royale Garden 1 = Rp. " + pendapatan);
    }
}
