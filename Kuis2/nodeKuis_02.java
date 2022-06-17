package Kuis2;

public class nodeKuis_02 {
    String data;
    nodeKuis_02 prev, next;

    nodeKuis_02(nodeKuis_02 prev, String data, nodeKuis_02 next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
