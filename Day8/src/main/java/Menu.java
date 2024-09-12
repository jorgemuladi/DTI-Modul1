import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
    List<Event> eventList = new ArrayList<>();

    public Menu () {
        this.eventList.add(new Event("Raisa",200,500_000));
        this.eventList.add(new Event("Sheila On 7",56,750_000));
        this.eventList.add(new Event("Dewa 19",5,900_000));
    }

    public void run(){
        System.out.println("\n===== WELCOME TO TICKET MASTER =====\n");
        System.out.println("1.Check Upcoming Events");
        System.out.println("2.Book Ticket");
        System.out.println("3.Check Your Ticket (need UUID)");
        System.out.println("4.Check All Sold Tickets");
        System.out.println("5.Exit\n");

        Scanner scanInt = new Scanner(System.in);
        int selection = Utils.scanInt("Selection: ", scanInt);

        switch (selection) {
            case 1:
                Utils.checkEvents(this.eventList);
                run();
                break;
            case 2:
                //book ticket
                TicketProcessing.run(this.eventList, scanInt);
                run();
                break;
            case 3:
                checkTicket(scanInt);
                run();
                break;
            case 4:
                checkAllTickets();
                run();
                break;
            case 5:
                System.out.println("Program closed.");
                break;
            default:
                System.out.println("not available");;
                run();
        }
        Utils.closeScanner(scanInt);
    }
    public void checkTicket(Scanner scanner) {
        String id = Utils.scanTicketUUID(scanner);
        Ticketable ticket = null;
        for (Event e : this.eventList) {
            if (e.getSingleTicket(id) != null) {
                ticket = e.getSingleTicket(id);
                break;
            }
        }
        if (ticket != null) {
            System.out.println("UUID : " + ticket.getUUID());
            System.out.println("Event : " + ticket.getEvent());
            System.out.println("Price : " + ticket.getPrice());
            System.out.println("User : " + ticket.getUser());
            System.out.println();
        } else {
            System.out.println("Ticket not found.");
            System.out.println();
        }
    }

    public void checkAllTickets() {
        System.out.println("======= \t Ticket List \t\t=======");
        List<Ticketable> ticketableList = new ArrayList<>();
        for (Event e : this.eventList) {
            ticketableList.addAll(e.getAllTickets());
        }
        if (ticketableList.isEmpty()) {
            System.out.println("Tickets not found.");
            System.out.println();
        } else {
            for (Ticketable t : ticketableList) {
                System.out.println("UUID : " + t.getUUID());
                System.out.println("Event : " + t.getEvent());
                System.out.println("Price : " + t.getPrice());
                System.out.println("User : " + t.getUser());
                System.out.println();
            }
        }
    }
}
