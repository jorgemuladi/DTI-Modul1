package Day7;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

    public Object[] parseContent(String filepath, int rows) {

        String[] productName = new String[rows];
        int[] totalSold = new int[rows];
        double[] itemSold = new double[rows];

        try {
            Scanner scanner = new Scanner(new File(filepath));
            int count = 0;

            while(scanner.hasNext()) {
                String line = scanner.nextLine();
                String[] rowData = line.split(",");

                //skip heading
                if (count > 0 && count <= rows) {

                    productName[count-1] = (rowData[0]);
                    totalSold[count-1] = (Integer.parseInt(rowData[1]));
                    itemSold[count-1] = (Double.parseDouble(rowData[2]));
                }
                count += 1;
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (NumberFormatException e) {
            System.out.println("File content is not a number");
        } catch (Exception e) {
            System.out.println("Global exception");
        }
        return new Object[] {productName, totalSold, itemSold};
    }

    public double calTotalSales(int[] totalSold, double[] itemSold) {
        double totalSales = 0;

        try {
            for (int i=0; i< totalSold.length; i++) {
                totalSales += (totalSold[i] * itemSold[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is empty");
        }

        return totalSales;
    }

    public int totalProductSold(int[] totalSold) {
        int total = 0;

        for(int i=0; i<totalSold.length; i++) {
            total += totalSold[i];
        }
        return total;
    }

    public String findMostBought(int[] totalSold, String[] item) {
        int max = 0;
        int index = 0;

        for (int i=0; i<totalSold.length; i++) {
            if (totalSold[i] > max) {
                max = totalSold[i];
                index = i;
            }
        }
        return item[index];
    }

    public String findleastBoughtItem(int[] totalSold, String[] item) {
        int min = 2147483647;
        int index = 0;

        for (int i=0; i<totalSold.length; i++){
            if(totalSold[i] < min) {
                min = totalSold[i];
                index = i;
            }
        }
        return item[index];
    }
}