package Pertemuan_9.Source_Code.Tugas_2;

public class stackStruk {
    int size;
    int top;
    struk data[];

    stackStruk(int size){
        this.size = size;
        data = new struk[size];
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

    public void push(struk srk){
        if(!IsFull()){
            top++;
            data[top] = srk;
        } else{
            System.out.println("Isi data sudah penuh");
        }
    }

    public void pop(){
        if(!IsEmpty()){
            struk s = data[top];
            top--;
            System.out.println("Data yang Dikeluarkan : " + s.noTrans + " " + s.tanggal + " " + s.jumlah + " " + s.harga);
        } else{
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek(){
        System.out.println("Struck Paling Atas : " + data[top].noTrans + " " + data[top].tanggal + " " + data[top].jumlah
        + " " + data[top].harga);
    }

    public void print(){
        System.out.println("Isi Stack : ");
        for (int i = 0; i >= 0 ; i--){
            System.out.println(data[i].noTrans + " " + data[i].tanggal + " " + data[i].jumlah + " " + data[i].harga + " ");
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

}
