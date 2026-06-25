import LinkedList.*;

public class Main {

    public static void main(String[] args) {
        
        final Station BFM = new Station("Bibliotèque François Mitterand", "Paris, 13e");
        final Station OLYMPIADES = new Station("Olympiades", "Paris, 13e");

        Line m14 = new Line();
        m14.printLine();

        m14.addStation(OLYMPIADES);
        m14.addStation(BFM);

        m14.printLine();
        

    }
    
}
