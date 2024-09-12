import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

public class Event {
    private String eventName;
    private int availableTicket;
    private double priceTicket;
    private List<Ticketable> ticketList = new ArrayList<>();

    Event(String eventName, int availableTicket, double priceTicket) {
        this.eventName = eventName;
        this.availableTicket = availableTicket;
        this.priceTicket = priceTicket;
    }


    public String getEventName() {
        return this.eventName;
    }

    public int getTicketAvailability() {
        return this.availableTicket;
    }



    public double getTicketPrice() {
        return this.priceTicket;
    }

    public String formatPrice(double priceTicket) {
        NumberFormat format = NumberFormat.getNumberInstance(new Locale("id", "ID"));
        String formattedPrice = format.format(priceTicket);
        return "Rp." + formattedPrice;
    }

    public void buyTicket(String userName) {
        if (this.availableTicket > 0) {
            this.availableTicket--;
            Ticketable newTicket = new Ticket(userName, this.eventName, this.priceTicket);
            this.ticketList.add(newTicket);
            System.out.println("======= \t Ticket Sold \t\t=======");
            System.out.println("UUID : " + newTicket.getUUID());
            System.out.println("Event : " + newTicket.getEvent());
            System.out.println("Price : " + formatPrice(newTicket.getPrice()));
            System.out.println("User : " + newTicket.getUser());
            System.out.println("Available Tickets : " + this.availableTicket);
            System.out.println();
        } else {
            System.out.println("Ticket sold out.");
            System.out.println();
        }
    }

    public List<Ticketable> getAllTickets() {
        return this.ticketList;
    }

    public Ticketable getSingleTicket(String id) {
        boolean exist = false;
        for (Ticketable t : this.ticketList) {
            if (Objects.equals(id, t.getUUID())) {
                return t;
            }
        }
        return null;
    }

    public void checkTicket(String id) {
        boolean exist = false;
        for (Ticketable t : this.ticketList) {
            if (Objects.equals(id, t.getUUID())) {
                System.out.println("UUID : " + t.getUUID());
                System.out.println("Event : " + t.getEvent());
                System.out.println("Price : " + t.getPrice());
                System.out.println("User : " + t.getUser());
                System.out.println();
                break;
            }
        }
        if (!exist) {
            System.out.println("Ticket not found for " + this.eventName + ".");
            System.out.println();
        }
    }

    public void checkAllTicket() {
        if (this.ticketList.isEmpty()) {
            System.out.println("No tickets found for " + this.eventName + ".");
            System.out.println();
        }
        for (Ticketable t : this.ticketList) {
            System.out.println("UUID : " + t.getUUID());
            System.out.println("Event : " + t.getEvent());
            System.out.println("Price : " + t.getPrice());
            System.out.println("User : " + t.getUser());
            System.out.println();
        }
    }
}
