

import java.util.Scanner;

public class SubMenu {
    private User user = null;
    private Scanner scanner;

    SubMenu(User user, Scanner scanner) {
        this.user = user;
        this.scanner = scanner;
    }

    public void run() {
        System.out.println("======= \t \tWellcome " + this.user.getUserName() + " \t\t=======");
        System.out.println("1. View todo list.");
        System.out.println("2. Add todo.");
        System.out.println("3. Delete todo. (ID Required)");
        System.out.println("4. Logout");
        int selection = Utils.scanInt(this.scanner, "Selection : ");
        switch (selection) {
            case 1:
                //todo view
                if (this.user.getTodoList().isEmpty()) {
                    System.out.println("Todo list is empty.");
                } else {
                    System.out.println("======= \t \tTODO LIST \t\t=======");
                    for (Todo t : this.user.getTodoList()) {
                        System.out.println("ID : " + t.getId());
                        System.out.println("Action : " + t.getText());
                    }
                }
                run();
                break;
            case 2:
                //todo add
                try {
                    String action = Utils.scanText(this.scanner, "Action : ");
                    Todo newTodo = new Todo(action);
                    boolean success = this.user.addTodo(newTodo);
                    if (!success)
                        throw new RuntimeException();
                    System.out.println("Todo added.");
                } catch (Exception e) {
                    System.out.println("Adding todo list failed.");
                }
                run();
                break;
            case 3:
                //todo remove
                String id = Utils.scanText(this.scanner, "ID : ");
                this.user.removeTodo(id);
                run();
                break;
            case 4:
                System.out.println("Logged out.");
                break;
            default:
                System.out.println("Selection is not available.");
                run();
        }
    }
}