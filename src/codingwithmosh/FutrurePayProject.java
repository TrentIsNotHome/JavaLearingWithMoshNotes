package codingwithmosh;

import java.util.Scanner;

public class FutrurePayProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much do you get payed per hour?: ");
        String payPerhour = scanner.next();
        byte pay = Byte.parseByte(payPerhour); // info stored

        System.out.print("How much do you hours do you work in a day for?: ");
        String workingHours = scanner.next();
        byte working = Byte.parseByte(workingHours); // info stored

        System.out.print("Now how many days do you work in a week?: ");
        String daysInaWeek = scanner.next();
        byte days = Byte.parseByte(daysInaWeek); // info stored

        int total = pay * working * days;
        System.out.println("in total you will get $" + total +" for those " + daysInaWeek + " working days");
        int weektotal = total * 14;
        System.out.println("so every 2 weeks you will get $" + weektotal);



    }
}
