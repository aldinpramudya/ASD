package Pertemuan_7.Latihan_7;

public class PencarianAngka {
    Angka listAngka[] = new Angka[10];
    int idx;

    void tambah(Angka a){
        if(idx <  listAngka.length){
            listAngka[idx] = a;
            idx++;
        } else{
            System.out.println("Data Sudah Penuh");
        }
    }

    void tampil(){
        for(Angka a : listAngka){
            a.tampil();
        }
    }

    void bubbleSort(){
        for (int i = 0 ; i < listAngka.length-1 ; i++){
            for (int j = 1 ; j < listAngka.length-i ; j++){
                if(listAngka[j].angka < listAngka[j-1].angka){
                    Angka tmp = listAngka[j];
                    listAngka[j] = listAngka[j-1];
                    listAngka[j-1] = tmp;
                }
            }
        }
    }

    public int SequentialSearch(int cari){
        int posisi = -1;
        for(int i = 0 ; i < listAngka.length ; i++){
            if (listAngka[i].angka == cari){
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    public void tampilPosisi(int x, int pos){
        if(pos != -1){
            System.out.println("Data = " + x + "Ditemukan pada indeks ke " + pos);
        } else {
            System.out.println("Mohon maaf data tidak ditemukan");
        }
    }
}
