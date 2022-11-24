public class UC07_SearchNode {
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
    public void SearchNode(){
        if(head==null){
            System.out.println(" Linked list is empty... ");
            return; //
        }
        Node tempNode = head; //coped all data node elements
        int data1 = 30;
        while (tempNode!= null){
            if(tempNode.data == data1)
                System.out.printf(data1 + " Present ");

        }

    }


    public static void main(String[] args) {
        UC07_SearchNode SList = new UC07_SearchNode();
        SList.addFirst(70);
        SList.addFirst(30);
        SList.addFirst(50);
        SList.printNode();
        SList.SearchNode();
        SList.printNode();

    }
}
