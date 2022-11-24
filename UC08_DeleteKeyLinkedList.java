public class UC08_DeleteKeyLinkedList {
    private Node head;

    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next = null;
        }
    }
    public static UC08_DeleteKeyLinkedList insert(UC08_DeleteKeyLinkedList list,
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
    // Method to print the LinkedList.
    public static void printList(UC08_DeleteKeyLinkedList list)
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
    public static UC08_DeleteKeyLinkedList
    deleteAtPosition(UC08_DeleteKeyLinkedList list, int index)
    {
        // Store head node
        Node currNode = list.head, prev = null;

        //
        // CASE 1:
        // If index is 0, then head node itself is to be
        // deleted

        if (index == 0 && currNode != null) {
            list.head = currNode.next; // Changed head

            // Display the message
            System.out.println(
                    index + " position element deleted");

            // Return the updated List
            return list;
        }

        //
        // CASE 2:
        // If the index is greater than 0 but less than the
        // size of LinkedList
        //
        // The counter
        int counter = 0;

        // Count for the index to be deleted,
        // keep track of the previous node
        // as it is needed to change currNode.next
        while (currNode != null) {

            if (counter == index) {
                // Since the currNode is the required
                // position Unlink currNode from linked list
                prev.next = currNode.next;

                // Display the message
                System.out.println(
                        index + " position element deleted");
                break;
            }
            else {
                // If current position is not the index
                // continue to next node
                prev = currNode;
                currNode = currNode.next;
                counter++;
            }
        }

        // If the position element was found, it should be
        // at currNode Therefore the currNode shall not be
        // null
        //
        // CASE 3: The index is greater than the size of the
        // LinkedList
        //
        // In this case, the currNode should be null
        if (currNode == null) {
            // Display the message
            System.out.println(
                    index + " position element not found");
        }

        // return the List
        return list;
    }



    public static void main(String[] args) {
        UC08_DeleteKeyLinkedList DList = new UC08_DeleteKeyLinkedList();
        DList = insert(DList , 56);
        DList = insert(DList , 30);
        DList = insert(DList , 40);
        DList = insert(DList , 70);
        printList(DList);
        deleteAtPosition(DList, 1);
        printList(DList);
        System.out.printf (" This Final List  ");

//        System.out.println("The size of the linked list is: "
//                + list.size());


    }
}
