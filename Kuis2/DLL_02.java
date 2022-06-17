package Kuis2;

public class DLL_02 {
    nodeKuis_02 head;
    int size;
    int top;
    nodeKuis_02 data[];

    public DLL_02(){
        head = null;
        size = 0;
    }

    public boolean IsEmpty(){
       return head == null;
    }

    public void print(){
        if(!IsEmpty()){
            nodeKuis_02 tmp = head;
            while (tmp != null){
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("\nBerhasil Diisi");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void addFirst(String item){
        if(IsEmpty()){
            head = new nodeKuis_02(null, item, null);
        } else {
            nodeKuis_02 newNode = new nodeKuis_02(null, item, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void removeFirst() throws Exception{
        if (IsEmpty()){
            throw new Exception("List Masih Kosong, Tidak Dapat Menghapus");
        } else{
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public String getFirst() throws Exception{
        if(IsEmpty()){
            throw new Exception("List Masih Kosong !");
        }
        return head.data;
    }

}
