public class UC06_DeleteLastElement {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
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
    public void DeleteLast(){
        if (head== null){
            System.out.printf(" The List Is Empty");
            return;
        }
        if(head.next==null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node LastNode = head.next;
        while (LastNode.next!=null){
            LastNode =LastNode.next;
            secondLast =secondLast.next;
        }
        secondLast.next=null;
    }




    public static void main(String[] args) {
        UC06_DeleteLastElement Dlist = new UC06_DeleteLastElement();
        Dlist.addFirst(56);
        Dlist.addFirst(30);
        Dlist.addFirst(70);
        Dlist.printNode();
        Dlist.DeleteLast();
        Dlist.printNode();


    }
}
