public class UC3_Append_LinkedList {
    Node head; // head of list
    /* Linked list Node.
    Node is a static nested class
    so main() can access it*/
        static class Node {

            int data;
            Node next;

            // Constructor
            Node(int d)
            {
                data = d;
                next = null;
            }

    public static UC3_Append_LinkedList insert(UC3_Append_LinkedList list,
                                    int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // Insert the new_node at last node
            last.next = new_node;
        }

        // Return the list by head
        return list;
    }
            public static void printList(UC3_Append_LinkedList list) //method for print list
            {
                Node currNode = list.head;

                System.out.print("LinkedList: ");

                // Traverse through the LinkedList
                while (currNode != null) {
                    // Print the data at current node
                    System.out.print(currNode.data + " ");

                    // Go to next node
                    currNode = currNode.next;
                }

                System.out.println();
            }
            public static void main(String[] args) {
        UC3_Append_LinkedList list = new UC3_Append_LinkedList();
        list = insert(list, 56);
        list = insert(list, 30);
        list = insert(list, 70);
        printList(list);


    }}}

