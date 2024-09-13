
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class User {
    private UUID id;
    private String userName;
    private String password;
    private List<Todo> todoList = new ArrayList<>();

    User(String userName, String password) {
        this.id = UUID.randomUUID();
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public UUID getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public Boolean authentication(String password) {
        return Objects.equals(password, this.password);
    }

    public boolean addTodo(Todo todo) {
        try {
            this.todoList.add(todo);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public void removeTodo(String id) {
        boolean success = false;
        for (Todo t : this.todoList) {
            if (t.getId().toString().equals(id)) {
                this.todoList.remove(t);
                success = true;
                break;
            }
        }
        if (success) {
            System.out.println("Delete todo successful.");
        } else {
            System.out.println("Todo not found.");
        }
    }

    public List<Todo> getTodoList() {
        return this.todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }
}