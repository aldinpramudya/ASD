package Pertemuan_6.Source_Code;

public class MainTiket {
    public static void main(String[] args) {
        TiketService tkt = new TiketService();
        Tiket t1 = new Tiket("T1", 50000, "Mondstadt", "Inazuma");
        Tiket t2 = new Tiket("Natus Vincere", 79000, "Camelot", "Septem");
        Tiket t3 = new Tiket("Victorous", 23000, "Tokyo", "Osaka");
        Tiket t4 = new Tiket("Shukoi Z-1", 30000, "Kiev", "Manchester");
        Tiket t5 = new Tiket("Hercules A49", 19000, "Singapore", "Itomori");

        tkt.tambah(t1);
        tkt.tambah(t2);
        tkt.tambah(t3);
        tkt.tambah(t4);
        tkt.tambah(t5);
        System.out.println("DATA TIKET");
        System.out.println("========Data Sebelum Dilakukan Sorting=======");
        tkt.tampilAll();

        System.out.println("=======Sorting Data dengan Bubble Sort=========");
        tkt.bubbleSort();
        tkt.tampilAll();

        System.out.println("===========Sorting Data dengan Selection Sort============");
        tkt.selectionSort();
        tkt.tampilAll();
    }
}
