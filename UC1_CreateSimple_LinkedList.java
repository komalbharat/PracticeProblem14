
public class UC1_CreateSimple_LinkedList {
    Node head;
    class Node {
        int data;
        Node next;


        Node(int data){
            this.data = data;
            this.next = null; // null
            System.out.printf(data +"\n");
        }
    }
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

//    public void deleteFirst(){
//        if(head == null){
//            System.out.println(" the list is empty");
//            return;
//        }
//        head = head.next;
//    }

    public void printNode(){
        if(head==null){
            System.out.println("Linked list is empty...");
            return;
        }
        Node tempNode = head; //coped all data node elements
        while(tempNode != null){ //Traversing
            System.out.print(tempNode.data + "=>");
            tempNode = tempNode.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
     UC1_CreateSimple_LinkedList ll = new UC1_CreateSimple_LinkedList();
     ll.addFirst(56);
     ll.addFirst(30);
     ll.addFirst(70);
     ll.printNode();

    }
}
