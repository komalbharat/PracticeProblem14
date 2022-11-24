/*Use LinkedList to do the Stack Operations*/
public class UC01_CreateStack {
    UC1_CreateSimple_LinkedList object = new UC1_CreateSimple_LinkedList();
            public void push(int data){
                object.addFirst(data);
            }
            public void Display(){
                object.printNode();
            }


    public static void main(String[] args) {
     UC01_CreateStack Stack = new UC01_CreateStack();
     Stack.push(65);
        Stack.push(30);
        Stack.push(70);
        Stack.Display();
    }
}
