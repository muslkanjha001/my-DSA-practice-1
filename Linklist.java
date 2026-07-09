import java.util.*;

class Linklist{
     public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;

        }
     }
     public static Node head;
     public static Node tail;
     public void addFirst(int data){
          Node newNode = new Node(data);
         if(head == null){
            head = tail = newNode;
            return;
              
         
        }

        newNode.next = head;
        head = newNode;
     }
     public void addLast(int data){
       Node  newNode = new Node(data);
       if(head==null){
        head = tail = newNode;
         return;
       }
       tail.next = newNode;
       tail = newNode;
     }
     public  void print() {
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.println();
    }
    public void add(int idx, int data ){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        int i =0;
        while(i<idx-1){
             temp = temp.next; 
             i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
         public int itrSearch(int key){
            Node temp = head;
            int  i = 0;
            while(temp!=null){
                if(temp.data == key){
                     return i;
                    }
                temp = temp.next;
                i++;

            }
            return -1;
        }

        
         

    



        
    
    
    


     
     public static void main(String args[]) {
        Linklist ll  = new Linklist();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(3,9 );
         
        System.out.println(ll.itrSearch(9));
        System.out.println(ll.itrSearch(10));


    }
}

