import LinkedList.*;

public class Main {

    public static void main(String[] args) {
        
        final Station BFM = new Station("Bibliotèque François Mitterand", "Paris, 13e");

        Line m14 = new Line(null);
        m14.addStation(new Station("Aéroport d'Orly", "Orly"));
        m14.printLine();
        m14.addStation(BFM);
        m14.printLine();

        m14.removeStation(BFM);
        m14.printLine();

    }
    
}
