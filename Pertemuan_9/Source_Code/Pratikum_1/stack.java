package Pertemuan_9.Source_Code.Pratikum_1;

public class stack {
    int size;
    int top;
    pakaian data[];

    public stack(int size){
        this.size = size;
        data = new pakaian[size];
        top = -1;
    }

    public boolean IsEmpty(){
        if(top == -1){
            return true;
        } else{
            return false;
        }
    }

    public boolean IsFull(){
        if(top == size - 1){
            return true;
        } else{
            return false;
        }
    }

    public void push(pakaian pkn){
        if(!IsFull()){
            top++;
            data[top]= pkn;
        } else{
            System.out.println("Isi Data sudah penuh !");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            pakaian x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek(){
        System.out.println("Elemen Teratas : " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " " + data[top].ukuran + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi Stack : ");
        for(int i = top; i >= 0 ; i--){
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " " + data[i].harga + " ");
        }
        System.out.println(" ");
    }

    public void clear(){
        if(!IsEmpty()){
            for(int i = top ; i >= 0 ; i--){
                top--;
            }
            System.out.println("Stack sudah Dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    public void getMin(){
        double hargaMin = data[0].harga;
        int idx = 0;
        for(int i = 0 ; i <= top ; i++){
            if(hargaMin > data[i].harga){
                hargaMin = data[i].harga;
                idx = i;            
            }
        }
        System.out.println("Harga Pakaian yang Paling Rendah : " + data[idx].jenis + " " + 
        data[idx].warna + " " + data[idx].merk + " " + data[idx].ukuran + " " + data[idx].harga);
    }

}
