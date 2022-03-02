# **Laporan Pratikum Pertemuan 2**
Nama : Aldin Ariel Pramudya

NIM  : 2141720233

Kelas  : 1G/D4-TI

## JAWABAN PERTANYAAN -------------------------

### **Pertanyaan 2.2 Deklarasi Class, Atribut, Method**

1. *Karakteristik Class* = Class merupakan sebuah konsep yang tidak memiliki bentuk nyata dan atribut pada class bersifat umum serta tidak memiliki nilai spesifik. *Karakter Objek* = Objek adalah bentuk nyata dari class dimana atribut memiliki nilai spesifik
2. class *nama_class*
3. Ada 4 Atribut pada class barang :
   
   a. namaBarang, JenisBarang dalam bentuk String ==> Deklarasi di line-13
   
   b. stok, hargaScanner dalam bentuk int ==> Deklarasi di line-14

4. Ada 4 method pada class barang :

    a. tampilBarang(): void ==> line-16 sampai line-21

    b. tambahStok(n : int): void ==> line-23 sampai line-25

    c. kurangiStok(n : int): void ==> line-27 sampai line-29

    d. hitungHargaTotal(jumlah : int): int ==> line-31 sampai line-33


5. void kurangiStok(int n){ 
   
   if(n>0){ 
       stok=stok-n;}
    else{
}

1. Menurut saya, tambahStok memiliki 1 parameter berupa int agar pada saat dieksekusi dengan instasi objek, terdapat nilai yang dapat dimasukkan kedalam atribut pada class

2. Menurut saya, method hitungHargaTotal() memiliki tipe data int karena method ini memiliki perintah return atau nilai yang akan dikembalikan sehingga nilai ini perlu tipe data yaitu int

3. Menurut saya, method tambahStok() memiliki tipe data void karena method ini tidak memiliki perintah untuk mengembalikan nilai atau perintah yang dilakukan adalah mem-print out saja.

### **Pertanyaan 2.3 Intansi Objek dan Mengkases Atribut & Method**

1. Instansiasi dilakukan pada baris-15, dengan nama objek b1

2. Akses pada atribut dapat dan method dapat dilakukan dengan mengetikkan nama objek instansiasi diikuti method yang akan dijalankan, Contoh *b1.hitungHargaTotal*

### **Pertanyaan 2.4 Membuat Konstruktor**

1. Deklarasi konstruktor berparamater dilakukan di baris ke-18 

2. Pada baris di bawah ini dilakukan intansiasi konstruktor berparameter dengan nama objek b2

3. Barang b3 = new Barang ("Aqua","Minuman", 2, 5000);

## Hasil Run

1. Barang

<input type = "image" src ="Run Barang.png">

2. Pacman

<input type = "image" src ="Run Pacman.png">
