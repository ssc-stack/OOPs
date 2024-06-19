package org.example.constructors;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data=data;
    }

    public Node(Node node) { // Deep Copy Constructor
        this.data=node.data;
        if(node.next!=null) {
            this.next=new Node(node.next.data);
        }
    }
}
