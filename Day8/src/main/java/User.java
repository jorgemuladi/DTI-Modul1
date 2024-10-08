import java.util.UUID;

public class User {
    private String name;
    private String ID;
    private Ticket ticket;

    public User(String name) {
        UUID uuid = UUID.randomUUID();
        this.ID = uuid.toString();
        this.name = name;
    }

    public void saveTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getID() {
        return ID;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public String getName() {
        return name;
    }
}
