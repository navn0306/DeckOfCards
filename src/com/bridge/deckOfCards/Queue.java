package com.bridge.deckOfCards;

public class Queue {

    Node front;

    public void addInQueue(String  data) {
        Node node = new Node(data);
        if (front == null) {
            front = node;
        } else {
            Node current = front;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
    }

    public void displayQueue() {
        Node current = front;
        if (current == null) {
            System.out.println("Queue is Empty");
        }
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
