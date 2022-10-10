package codingwithmosh;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        System.out.print("what is your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine().trim();
        // trim outs out the spaces in user input
        System.out.println("you are " + name);
    }
}
