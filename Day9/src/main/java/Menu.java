

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    List<User> userList = new ArrayList<>();

    public void run() {
        System.out.println("======= To Do App =======");
        System.out.println("1. Register");
        System.out.println("2. Login");
        System.out.println("3. Exit");
        Scanner scanIn = new Scanner(System.in);
        int selection = Utils.scanInt(scanIn, "Selection : ");
        switch (selection) {
            case 1:
                //todo register
                try {
                    String userName = Utils.scanText(scanIn, "Username : ");
                    if (checkDuplicate(this.userList, userName))
                        throw new RuntimeException("Duplicated username.");
                    String password = Utils.scanText(scanIn, "Password : ");
                    User newUser = new User(userName, password);
                    this.userList.add(newUser);
                    System.out.println("Registration success.");
                } catch (Exception e) {
                    System.out.println("Registration failed.");
                    System.out.println("Reason : " + e.getMessage());
                }
                run();
                break;
            case 2:
                //todo login
                String userName = Utils.scanText(scanIn, "Username : ");
                String password = Utils.scanText(scanIn, "Password : ");
                User currentUser = null;
                for (User u : userList) {
                    if (u.getUserName().equals(userName) && u.authentication(password)) {
                        currentUser = u;
                        break;
                    }
                }
                if (currentUser == null) {
                    System.out.println("Username or password is wrong.");
                } else {
                    System.out.println("Login succesful.");
                    SubMenu subMenu = new SubMenu(currentUser, scanIn);
                    subMenu.run();
                }
                run();
                break;
            case 3:
                System.out.println("Program closed.");
                break;
            case 69:
                debugUserList(this.userList);
                run();
            default:
                System.out.println("Selection is not available.");
                run();
                break;
        }
        Utils.closeScanner(scanIn);
    }

    public void debugUserList(List<User> userList) {
        for (User u : userList) {
            System.out.println(u.getId());
            System.out.println(u.getUserName());
        }
    }

    public boolean checkDuplicate(List<User> userList, String userName) {
        for (User u : userList) {
            if (u.getUserName().equals(userName)) {
                return true;
            }
        }
        return false;
    }

}