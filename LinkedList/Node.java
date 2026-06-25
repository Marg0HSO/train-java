package LinkedList;

public class Node {

    // attributes
    private Node previous;
    private Node next;
    private Station current;

    // builders
    public Node(Station current, Node previous, Node next){
        this.previous = previous;
        this.next = next;
        this.current = current;
    }
    
    // getters
    public Node getPrevious(){return this.previous;}
    public Node getNext(){return this.next;}
    public Station getCurrent(){return this.current;}

    // setters
    public void setPrevious(Node previous){this.previous = previous;}
    public void setNext(Node next){this.next = next;}
    public void setCurrent(Station current){this.current = current;}

    // methods

    // void printLine() : Print the line
    public void printLine(){
        System.out.print(this.current.getName());
        if (this.next != null){
            System.out.print(" <---> ");
            this.next.printLine();
        } else {
            System.out.println();
        }
    }
    
}
