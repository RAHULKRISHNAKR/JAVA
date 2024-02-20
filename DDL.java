package huhu;
import java.io.*;

class node{
    int data;
    node prev;
    node next;

    node(int value){
    data=value;
    prev=null;
    next=null;
    }
}

public class DDL{
    static node head=null;
    static node tail=null;
    
    static void insertAtBeg(int data){
        node temp = new node(data);
        if(head ==null){
            head =temp;
            tail=temp;  
        }
        else{
            temp.next=head;
            head.prev=temp;
            head=temp;
        }
    }
    static void insertAtEnd(int data){
        node temp = new node(data);
        if(tail==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            temp.prev=tail;
            tail=temp;
        }
    }

    static void insertAtPos(int data,int position){
        node newNode = new node(data);
        if(position ==1){
            insertAtBeg(data);
        }
        else{
            node current = head;
            int curpos =1;
            while(current!=null && curpos<position){
                current = current.next;
                curpos++;
            }
            if(current == null){
                insertAtEnd(data);
            }
            else{
                newNode.next=current;
                newNode.prev = current.prev;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }
    }
    static void deleteAtBeg(){
        if(head==null){
            return;
        }
        if(head==tail){
            head = tail=null;
            return;
        }
        node temp=head;
        head= head.next;
        head.prev=null;
        temp.next=null;
    }
    static void deleteAtEnd() 
    { 
        if (tail == null) { 
            return; 
        } 
  
        if (head == tail) { 
            head = null; 
            tail = null; 
            return; 
        } 
  
        node temp = tail; 
        tail = tail.prev; 
        tail.next = null; 
        temp.prev = null; 
    } 
    static void dltAtPos(int position){
        if(head==null)
            return;

        if(position==1){
            deleteAtBeg();
            return;
        }
        node current =head;
        int count=1;
        while(current!=null && count!=position){
            current = current.next;
            count++;
        }
        if(current==null){
            return;
        }
        if(current == tail){
            deleteAtEnd();
            return;
        }

        current.prev.next = current.next;
        current.next.prev=current.prev;
        current.next=null;
        current.prev=null;
    }
    static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println(" NULL");
    }

    public static void main(String[] args){
        int choice=0;
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        while(choice!=7){
            switch(choice){
                case 1: System.out.println("enter data to enqueue"); 
            }
        }
    }

}



