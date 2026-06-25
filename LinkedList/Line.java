package LinkedList;

public class Line {

    // attributes
    private Node first;
    private Node last;

    // builders
    public Line(Node first, Node last){
        this.first = first;
        this.last = last;
    }

    public Line(){
        this(null, null);
    }

    // getters
    public Node getFirst(){return this.first;}
    public Node getLast(){return this.last;}

    // setters
    public void setFirst(Node first){this.first = first;}
    public void setLast(Node last){this.last = last;}

    // methods

    // void printLine() : Print the line
    public void printLine(){
        if (this.first == null){
            System.out.println(" === ");
        } else {
            this.first.printLine();
        }
    }

    // void addStation() : add a station at the end of the line
    public void addStation(Station station){
        Node newStation = new Node(station, this.last, null);
        if (this.last == null){
            this.first = newStation;
            this.last = newStation;
        } else {
            this.last.setNext(newStation);
            this.last = newStation;
        }
    }

}
