package Stack;

import java.util.*;

public class UsinglinkedList {
    static class Node{
        int data;
        Node next;
    
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Stack{
        static Node head = null;

        public static boolean isEmpty(){
            if(head == null){
                return true;
            }
            return false;
        }
        public static void push(int data){
            Node newnoNode  = new Node(data);
            if(isEmpty()){
                head = newnoNode;
                return;
            }
            newnoNode.next = head;
            head = newnoNode;
        }
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            return top;

        }
    }
    public static void main(String[] args) {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

