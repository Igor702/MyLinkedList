package com.company;

import java.util.Collection;

public class LinkedList <E>{
   private Node<E> head;

    public void add(E data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null){
            head = node;
        }else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = node;
        }

    }

    public void addAll(Collection<? extends E> elements){
        for (E e:elements){
            add(e);
        }
    }


    public void show(){
        Node n = head;
        while (n != null){

            System.out.println(n.data);
            n = n.next;
        }
    }
}
