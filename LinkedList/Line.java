package LinkedList;

public class Line {

    // attributes
    private Node head;

    // getters
    public Node getHead(){return this.head;}

    // setters
    public void setHead(Node head){this.head = head;}

    // methods

    // int length() : Returns the length of the line // if the line is empty, it returns -1
    public int length(){
        if (this.head != null){
            return this.head.length();
        } else {
            return -1;
        }
    }

    
}
