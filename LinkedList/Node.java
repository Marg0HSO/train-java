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
        }
    }

    // boolean addStation() : Add station in the line
    public boolean addStation(Station station){
        if (this.next == null){
            this.next = new Node(station, this, null);
            return true;
        } else {
            return this.next.addStation(station);
        }
    }

    // boolean removeStation() : Remove station of the le line
    public boolean removeStation(Station station){
        if (this.current == station){
            this.previous.setNext(this.next);
            this.next.setPrevious(previous);
            return true;
        } else {
            if (this.next == null){
                return false;
            } else {
                return this.next.removeStation(station);
            }
        }
    }

    // int length() : Returns the length of the line aften this node
    public int length(){
        if (this.next != null){
            return 1 + this.next.length();
        } else {
            return 1;
        }
    }

    
}
