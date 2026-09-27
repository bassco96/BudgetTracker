import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BudgetTracker budget = new BudgetTracker();

        boolean running = true;

        // Continue displaying the menu until the user chooses to exit.
        while (running) {
            System.out.println("\n== Budget Tracker ==");
            System.out.println("1. Add expense");
            System.out.println("2. View all expenses");
            System.out.println("3. Remove expense");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine();

            switch (input) {
                case "1":
                    System.out.print("Enter amount: $");
                    int amount = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter category: ");
                    String category = scanner.nextLine();

                    System.out.print("Enter date (MoDaYr): ");
                    int date = Integer.parseInt(scanner.nextLine());

                    // Create an Expense object from the user's input.
                    Expense expense = new Expense(amount, category, date);
                    budget.addExpense(expense);

                    System.out.println("Expense has been added.");
                    break;

                case "2":
                    budget.viewExpenses();
                    break;

                case "3":
                    if (budget.isEmpty()) {
                        System.out.println("Budget is empty!");
                        break;
                    }

                    budget.viewExpenses();

                    System.out.print(
                            "Enter the number of the expense to remove, or 0 to return: "
                    );

                    int selection = Integer.parseInt(scanner.nextLine());

                    if (selection == 0) {
                        break;
                    }

                    // removeExpense returns false if the user enters an invalid number.
                    if (budget.removeExpense(selection)) {
                        System.out.println("Expense has been removed.");
                    } else {
                        System.out.println("Invalid expense number.");
                    }

                    break;

                case "4":
                    running = false;
                    System.out.println("Exiting program... bye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter 1-4.");
            }
        }

        scanner.close();
    }
}