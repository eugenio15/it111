import java.util.Scanner;

public class dailyspecials2 {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            String specials = "";
            String coffee = "";
            double price = 0.0;
            int amounts;

            // Loop weekday
            while (true) {
                System.out.println("Please enter weekday, excluding weekends ");
                specials = input.next();

                boolean isWeekend = specials.equalsIgnoreCase("Saturday") || specials.equalsIgnoreCase("Sunday");

                if (isWeekend) {
                } else {
                    break;


                }
            }

            specials = specials.substring(0, 1).toUpperCase() + specials.substring(1).toLowerCase();

            // coffee and price based on day
            switch (specials) {
                case "Monday" -> {
                    coffee = "Latte";
                    price = 4.95;
                }
                case "Tuesday" -> {
                    coffee = "Frappe";
                    price = 5.95;
                }
                case "Wednesday" -> {
                    coffee = "Cappuccino";
                    price = 4.35;
                }
                case "Thursday" -> {
                    coffee = "Regular Joe";
                    price = 1.00;
                }
                case "Friday" -> {
                    coffee = "Green Tea Latte";
                    price = 6.95;
                }
                default -> {
                    System.out.println("Invalid day entered. Please restart the program.");
                    input.close();
                    return;
                }
            }

            // coffee of the day special
            System.out.println(specials + "'s coffee of the day is a " + coffee + " and the price is $" + price);

            // Ask for quantity
            System.out.print("How many " + coffee + "s would you like to order? ");
            amounts = input.nextInt();
            double totalPrice = amounts * price;

            // discounts
            if (amounts == 0) {
                System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
            } else if (amounts == 1) {
                System.out.printf("Looks like you will be ordering only 1 today totalling  %s. Total = $%.2f%n", coffee, totalPrice);
            } else if (amounts <= 4) {
                System.out.printf("%d %ss have been ordered totaling $%.2f dollars!%n", amounts, coffee, totalPrice);
            } else if (amounts < 10) {
                double discount = totalPrice * 0.90;
                System.out.printf("Looks like you qualify for a group discount! Your regular price is : $%.2f%n", totalPrice);
                System.out.printf("You have ordered regular Joes but will be only charged : $%.2f%n", discount);
            } else {
                double discount = totalPrice * 0.80;
                System.out.printf("A bigger group discount! Your regular is price: $%.2f%n", totalPrice);
                System.out.printf("You have ordered cappucinos but will be only charged: $%.2f%n", discount);
            }

            input.close();
        }
    }

