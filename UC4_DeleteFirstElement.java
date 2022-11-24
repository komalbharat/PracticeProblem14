public class UC4_DeleteFirstElement {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addNode(int data) {
        //Create a new node
        Node newNode = new Node(data);

        //Checks if the list is empty
        if(head == null) {
            //If list is empty, both head and tail will point to new node
            head = newNode;
            tail = newNode;
        }
        else {
            //newNode will be added after tail such that tail's next will point to newNode
            tail.next = newNode;
            //newNode will become new tail of the list
            tail = newNode;
        }
    }
    /*///////////////////////////////////////////////////////////*/
    public void DeleteFirst() {

        //Checks if the list is empty
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        else {
            //Checks whether the list contains only one node
            //If not, the head will point to next node in the list and tail will point to the new head.
            if(head != tail) {
                head = head.next;
            }
            //If the list contains only one node
            //then, it will remove it and both head and tail will point to null
            else {
                head = tail = null;
            }
        }
    }

    /// it will print the element
    public void display() {
        //Node current will point to head
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public Node head = null; //Define head and tail
    public Node tail = null;
    public static void main(String[] args) {
        UC4_DeleteFirstElement DList = new UC4_DeleteFirstElement();
        DList.addNode(12);
        DList.addNode(13);
        DList.addNode(19);
        DList.addNode(18);
        System.out.println(" Original List: ");
        DList.display();
        DList.DeleteFirst();
        System.out.printf(" Deleted First Element \n ");
        DList.display();

    }
}
