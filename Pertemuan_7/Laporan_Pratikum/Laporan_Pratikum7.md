# Laporan Pratikum 6

Nama : Aldin Ariel Pramudya

NIM : 2141720233

Kelas : 1G/D4-TI

## Jawaban Pertanyaan ---------------

### Pertanyaan 6.2.3
1. Method TampilPosisi(); digunakan untuk menunjukkan posisi dari data yang dicari pada indeks pada array dengan pencarian NIM, sedangkan method TampilData(); digunakan untuk menampilkan data secara detail seperti nama, umur, ipk pada array yang sesuai dengan NIM

2. 
         if(listMHs[j].nim == cari){
                    posisi = j;
                    break;
                }

Fungsi Break digunakan untuk menghentikan proses perulangan apabila syarat dalam if telah terpenuhi

3. Apabila nim yang dimasukkan tidak terurut baik ascending atau descending, program masih dapat berjalan dan hasil pencarian tetap sesuai dengan pencarian. Karena pada sequential search menggunakan algoritma dimana dilakukan pengecekan secara berurutan dari indeks pertama hingga bertemu

### Pertanyaan 6.3.3
1. Proses divide terjadi pada potongan program berikut ini

        if(right >= left){
                mid = (left + right)/2;

2. Proses Conquer terjadi pada potongan program berikut ini 

        if(cari == listMHs[mid].nim){
                    return (mid);
                } else if (listMHs[mid].nim > cari){
                    return FindBinarySearch(cari, left, mid - 1);
                 } else {
                     return FindBinarySearch(cari, mid + 1, right);
                }

3. Program dapat berjalan, namun data hasil pencarian tidak sesuai dengan inputan yang dicari sehingga hasil pencarian tidak valid.

