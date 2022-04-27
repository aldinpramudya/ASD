package Pertemuan_10.Tugas_Pratikum.Tugas_2;

public class queue {
    mahasiswaq[] data;
    int front;
    int rear;
    int size;
    int max;

    public queue(int n){
        max = n;
        data = new mahasiswaq[max];
        size = 0;
        front = size = -1;
    }

    public boolean IsEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean IsFull(){
        if(size == max){
            return true;
        }
        else{
            return false;
        }
    }

    public void Enqueue(mahasiswaq dt){
        if(IsFull()){
            System.out.println("Queue sudah penuh");
        } else {
            if(IsEmpty()){
                front = rear = 0;
            }
            else{
                if(rear == max -1){
                    rear = 0;
                }
                else{
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public mahasiswaq Dequeue(){
        mahasiswaq dt = new mahasiswaq();
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        }
        else{
            dt = data[front];
            size--;
            if(IsEmpty()){
                front = rear = -1;
            }
            else{
                 if(front == max - 1){
                     front = 0;
                 }
                 else{
                     front++;
                 }
            }
        }
        return dt;
    }

    public void print(){
        if(IsEmpty()){
            System.out.println("Queue masih kosong");
        } else {
            int i = 0;
            while(i != rear){
                System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen + " " + data[i].ipk);
                i = (i + 1) % max;
            }
            System.out.println(data[i].nim + " " + data[i].nama + " " + data[i].absen + " " + data[i].ipk);
            System.out.println("Jumlah Elemen = " + size);
        }
    }

    public void peek(){
        if(!IsEmpty()){
            System.out.println("Elemen Terdepan = " + data[front].nim + " " + data[front].nama + " " + data[front].absen + " " + data[front].ipk);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void peekRear(){
        if(!IsEmpty()){
            System.out.println("Elemen Belakang = " + data[rear].nim + " " + data[rear].nama + " " + data[rear].absen + " " + data[rear].ipk);
        } else {
            System.out.println("Queue Masih Kosong");
        }
    }

    public void peekPosition(String dataCari){
        int i = front;
        int posisi = 1;
        System.out.print("Data " + dataCari + " ada pada posisi : ");
        while(i != rear){
            if(data[i].nim.equals(dataCari)){
                System.out.print(posisi + " ");
            }
            i = (i + 1) % max;
            posisi++;
        }
        if(data[i].nim.equals(dataCari)){
            System.out.print(posisi + " ");
        }
        System.out.println();
    }

    public void printMahasiswa(int position){
        int idCari = front;
        System.out.print("Data pada Posisi " + position + " adalah : ");
        for (int i = 0 ; i < position - 1 ; i++){
            idCari = (idCari + 1) % max;
        }

        System.out.println(data[idCari].nim + " " + data[idCari].nama + " " + data[idCari].absen + " " + data[idCari].ipk);
    }
}
