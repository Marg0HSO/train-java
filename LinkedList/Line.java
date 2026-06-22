package LinkedList;

public class Line {

    // attributes
    private Node head;

    // builders
    public Line(Node head){
        this.head = head;
    }

    public Line(){
        this(null);
    }

    // getters
    public Node getHead(){return this.head;}

    // setters
    public void setHead(Node head){this.head = head;}

    // methods

    // void printLine() : Print the line
    public void printLine(){
        if (this.head == null){
            System.out.println(" === ");
        } else {
            this.head.printLine();
            System.out.println();
        }
    }

    // boolean addStation() : Add a station to the line
    public boolean addStation(Station station){
        if (this.head == null){
            this.head = new Node(station, null, null);
            return true;
        } else {
            return this.head.addStation(station);
        }
    }

    // boolean removeStation() : Remove station of the le line
    public boolean removeStation(Station station){
        if (this.head == null){
            return false;
        } else {
            return this.head.removeStation(station);
        }
    }

    // int length() : Returns the length of the line // if the line is empty, it returns -1
    public int length(){
        if (this.head != null){
            return this.head.length();
        } else {
            return -1;
        }
    }

    
}
