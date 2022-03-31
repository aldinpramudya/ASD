# Laporan Pratikum 6

Nama : Aldin Ariel Pramudya

NIM : 2141720233

Kelas : 1G/D4-TI

## Jawaban Pertanyaan ---------------

### Pertanyaan 5.2.3

1. Bubble Sort tertulis di method void bubbleSort();

2. Tidak ada selection sort pada source code percobaan di atas

3. Swap merupakan proses pertukaran nilai dari satu array menuju array sebelumnya apabila memenuhi persyaratan yang telah ditentukan.

        Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;

4.  
             if(listMhs[j].ipk < listMhs[j-1].ipk){
                    Mahasiswa tmp = listMhs[j];
                    listMhs[j] = listMhs[j-1];
                    listMhs[j-1] = tmp;
Proses ini digunakan untuk melakukan proses swap dimana apabila array pertama nilainya lebih sedikit daripada array didepannya. Maka swap akan dilakukan

5.         for(int i = 0; i < listMhs.length-1 ; i++){
            for(int j =1 ; j<listMhs.length-i ; j++){
a. perulangan I (Outer Loop) digunakan untuk melakuakn loop pada array sedangkan perulangan J (Inner Loop) digunakan untuk melakukan array I agar bisa dibandingkan

b. Syarat pada perulangan i yaitu i < listMhs.length-1 dimana saat dimana array i akan melakukan loop pada indeks-1

c. Syarat pada perulangan j yaitu j < listMhs.length-i dimana array j akan melakukan looping di depan indeks i

d. terdapat 49 loop dan 1225 Tahapan

### Pertanyaan 5.3.3
1. 
            int idxMin = i;
            for(int j =i+1 ; j < listMhs.length ; j++){
                if(listMhs[j].ipk < listMhs[idxMin].ipk){
                    idxMin = j;
                }
            }
Potongan kode ini adalah sebagai syarat untuk melakukan swap dimana apabila array pertama lebih sedikit daripada array dengan index idxMin = 1, maka indeks yang lebih besar maka akan menjadi indeks j

### Pertanyaan 5.4.3
1. 

### Latihan Pratikum 5.5
Hasil Run

![Hasil Run](Base_Gambar/Run%20Tiket%201.png)

![Hasil Run 2](Base_Gambar/Run%20Tiket%202.png)