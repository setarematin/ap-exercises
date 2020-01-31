package exceptionsB2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] months = {"Januvary", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] dom = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = scanner.nextInt();
        try {
            System.out.println(months[month]);
            System.out.println(dom[month]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("wrong number");
        }
    }
}
