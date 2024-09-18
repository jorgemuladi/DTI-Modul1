

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select question to be run: ");
        int question = scanner.nextInt();
        scanner.nextLine();

        switch (question){
            // Stack : LIFO (Last in First Out)
            case 1 : {
                Stack stk = new Stack();

                stk.push('a');
                stk.push('b');
                stk.push('c');

                System.out.println("Top Stack : " + stk.peek());
                System.out.println("Stack size : " + stk.size());
                System.out.println();

                stk.pop();
                System.out.println("Top Stack after pop : " + stk.peek());
                System.out.println("Stack size after pop : " + stk.size());
                break;
            }
            // Queue : FIFO (First In First Out)
            case 2 : {
                Queue que = new Queue();

                que.enqueue('a');
                que.enqueue('b');
                que.enqueue('c');

                System.out.println("First Queue : " + que.peek());
                System.out.println("Queue size : " + que.size());
                System.out.println();

                System.out.println("First queue before dequeu : " + que.dequeue());
                System.out.println("First Queue after dequeue : " + que.peek());
                System.out.println("Queue size after pop : " + que.size());
                break;
            }
            // binary search
            case 3 : {
                // Create new array
                ArrayList<Integer> arr = new ArrayList<>();
                while(true){
                    System.out.println("Input number, press q to stop");
                    String inputtedVal = scanner.nextLine();

                    if (Character.toLowerCase(inputtedVal.charAt(0)) == 'q'){
                        break;
                    }

                    try {
                        arr.add(Integer.parseInt(inputtedVal));
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                System.out.println("Your array is : " + arr);

                // Convert to int[]
                int[] array = new int[arr.size()];
                for(int i = 0; i < array.length; i++){
                    array[i] = arr.get(i);
                }

                // Sort array
                Arrays.sort(array);
                System.out.println("Your sorted array is : " + Arrays.toString(array));

                // Binary search
                while(true){
                    System.out.println("Input your target number or press q to quit");
                    String inputVal = scanner.nextLine();
                    if(inputVal.charAt(0) == 'q'){
                        break;
                    }

                    try {
                        int x = Integer.parseInt(inputVal);
                        int index = BinarySearch.run(array, x);
                        if (index == -1){
                            System.out.println("Target not found !");
                        } else {
                            System.out.println("Target index : " + index);
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Please enter a valid number.");
                    }
                }
                break;
            }

        }

    }
}