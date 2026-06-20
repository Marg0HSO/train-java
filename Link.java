public class Link {
    
    private Station from;
    private Station to;
    private double time; // in seconds

    public Link(Station from, Station to, double time){
        this.from = from;
        this.to = to;
        this.time = time;
    }

    public double getTime(){
        return this.time;
    }

}
