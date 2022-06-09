package Pertemuan_13.Source_Code;

public class Node{
    int data;
    Node left;
    Node right;

    public Node(){

    }
    public Node(int data){
        this.left = null;
        this.data = data;
        this.right = null;
    }

    boolean isLeaf(){
        return left == null && right == null;
    }
}


