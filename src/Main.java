import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Input a month number: ");
        int month = scanner.nextInt();

        System.out.println("Input a year: ");
        int year = scanner.nextInt();

        int daysInMonth = 0;
        String monthName = "";

        switch (month) {
            case 1 -> {
                monthName = "January";
                daysInMonth = 31;
            }
            case 2 -> {
                monthName = "February";
                if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 30;
                }
            }
            case 3 -> {
                monthName = "March";
                daysInMonth = 31;
            }
            case 4 -> {
                monthName = "April";
                daysInMonth = 30;
            }
            case 5 -> {
                monthName = "May";
                daysInMonth = 31;
            }
            case 6 -> {
                monthName = "June";
                daysInMonth = 30;
            }
            case 7 -> {
                monthName = "July";
                daysInMonth = 31;
            }
            case 8 -> {
                monthName = "August";
                daysInMonth = 31;
            }
            case 9 -> {
                monthName = "September";
                daysInMonth = 30;
            }
            case 10 -> {
                monthName = "October";
                daysInMonth = 31;
            }
            case 11 -> {
                monthName = "November";
                daysInMonth = 30;
            }
            case 12 -> {
                monthName = "December";
                daysInMonth = 31;
            }
        }
        System.out.print(monthName + " " + year + " has " + daysInMonth + " days\n");

    }

}
