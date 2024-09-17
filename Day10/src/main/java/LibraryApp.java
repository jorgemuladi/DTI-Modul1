
import java.util.List;
import java.util.Scanner;

public class LibraryApp {
    public static Library library;

    public static void start() {
        Scanner scanner = new Scanner(System.in);
        library = new Library();

        library.addBook( "How to Win Friends and Influence People", "Dale Carnegie", "1936-10-01",
                new String[] {"Dapet cincin akik", "pergi ke gunung merapi", "lempar cincin ke kawah", "tamat"}, 3);

        boolean quit = false;
        int input;

        while (!quit) {
            System.out.println("-".repeat(30));
            System.out.println("1. List Library materials");
            System.out.println("2. List all borrowed materials");
            System.out.println("3. Borrow a material");
            System.out.println("0. Exit");

            input = readInputRange(scanner, 0, 3);

            switch (input) {
                case 0 : quit = true; break;
                case 1 : printAllMaterial(); break;
                case 2 : listAllBorrowedMaterial(); break;
                case 3 : borrowMaterial(scanner); break;
            }
        }
    }

    public static void printAllMaterial() {
        System.out.println("-".repeat(30));
        List<LibraryMaterial> materialList = library.getAllSampleMaterial();

        for (LibraryMaterial material : materialList) {
            System.out.printf("%s, Title = %s, Author = %s, Date = %s, Available = %d\n",
                    material.getMaterialID(), material.getTitle(), material.getAuthor(), material.getDate(),
                    library.countMaterialByID(material.getMaterialID()));
        }
    }

    public static void listAllBorrowedMaterial() {
        System.out.println("-".repeat(30));
        List<LibraryMaterial> materialList = library.listAllBorrowedMaterials();

        for (LibraryMaterial material : materialList) {
            System.out.printf("Library ID = %s, Title = %s, Author = %s, Date = %s\n",
                    material.getLibraryID(), material.getTitle(), material.getAuthor(), material.getDate());
        }
    }

    public static void borrowMaterial(Scanner scanner) {
        System.out.println("-".repeat(30));
        System.out.println("Which material you want to borrow ? 0 to cancel");
        int input = readInputRange(scanner, 0, 1);
        input--;

        if (input < 0)
            return;

        library.borrowMaterial(input);
    }

    public static int readInputRange(Scanner scanner, int min, int max) {
        boolean correctInput = false;
        int result = min;

        if (min > max)
            return result;

        while (!correctInput) {
            System.out.printf("Enter input between %d and %d : ", min, max);

            try {
                result = Integer.parseInt(scanner.nextLine());

                if ((result >= min) && (result <= max)) {
                    correctInput = true;
                } else {
                    System.out.println("Input outside of range");
                }
            } catch (Exception e) {
                System.out.println("Input parsing error");
            }
        }

        return result;
    }
}