import classes.City;
import classes.Event;
import classes.Location;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Event> events = Arrays.asList(
                (new Event(4,"Event01",new Location(1, new City(1,"Mar del Plata")))),
                (new Event(2,"Event04",new Location(2, new City(2,"Mar de Ajo")))),
                (new Event(5,"Event03",new Location(3, new City(3,"Mar de las Pampas")))),
                (new Event(1,"Event06",new Location(4, new City(4,"Balcarce")))),
                (new Event(6,"Event02",new Location(5, new City(5,"Miramar")))),
                (new Event(3,"Event05",new Location(6, new City(6,"Otamendi")))));

        /*Event e = Event.getEventById(events, 3);
        System.out.println(e);*/

        List<Event> result = new ArrayList<>();

        result = Event.getFirstFiveEventsOrdered(events);
        System.out.println(result);

        result = Event.getAlphabeticalOrdered(events);
        System.out.println(result);
    }
}
