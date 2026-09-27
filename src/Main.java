import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    BudgetTracker budget = new BudgetTracker();

    boolean running = true;

    while (running){
        System.out.println("\n==Budget Tracker==");
        System.out.println("1. Add expense");
        System.out.println("2. View all expenses");
        System.out.println("3. Remove expense");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");

        String input = scanner.nextLine();

        switch (input){
            case "1":
                System.out.print("Enter amount: $");
                int amount = scanner.nextInt();

                System.out.print("Enter category: ");
                String category = scanner.next();

                System.out.print("Enter date: MoDaYr ");
                int date = scanner.nextInt();

                Expense expense = new Expense(amount,category,date);
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
                else {
                    budget.viewExpenses();
                    System.out.println("Please enter the number of the expense you would like to remove OR " +
                            "type 0 to return:");
                    int selection = scanner.nextInt();
                    if (selection == 0){
                        break;
                    }
                    budget.removeExpense(selection);
                    System.out.println("Expense has been removed.");
                    break;
                }


            case "4":
                running = false;
                System.out.print("Exiting program...bye!");
                break;

        }


    }

    scanner.close();


}