
import java.util.UUID;

public class Todo {
    private UUID id;
    private String text;

    Todo(String text) {
        this.id = UUID.randomUUID();
        this.text = text;
    }

    public UUID getId() {
        return id;
    }

    public String getText() {
        return text;
    }
}