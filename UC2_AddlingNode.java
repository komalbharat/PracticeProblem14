public class UC2_AddlingNode {
    class Node{
        int data;
        Node next;

        public Node(int data) { /* Constructor */
            this.data = data;
            this.next = null;
        }
    }public Node head = null;
    public Node tail = null;

    //addNode() will add a new node to the list
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

    //display() will display all the nodes present in the list
    public void display() {
        //Node current will point to head
        Node current = head;

        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of linked list: ");
        while(current != null) {
            //Prints each node by incrementing pointer
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        UC2_AddlingNode sList = new UC2_AddlingNode();

        //Add nodes to the list
        sList.addNode(56);
        sList.addNode(30);
        sList.addNode(70);


        //Displays the nodes present in the list
        sList.display();
    }
}