package LinkedList;

public class Node {

    // attributes
    private Node previous;
    private Node next;
    private Station current;
    
    // getters
    public Node getPrevious(){return this.previous;}
    public Node getNext(){return this.next;}
    public Station getCurrent(){return this.current;}

    // setters
    public void setPrevious(Node previous){this.previous = previous;}
    public void setNext(Node next){this.next = next;}
    public void setCurrent(Station current){this.current = current;}

    // methods

    // int length() : Returns the length of the line aften this node
    public int length(){
        if (this.next != null){
            return 1 + this.next.length();
        } else {
            return 1;
        }
    }

    
}
