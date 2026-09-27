import java.util.ArrayList;

public class BudgetTracker {

    // Stores all expenses currently entered by the user.
    private final ArrayList<Expense> expenses;

    public BudgetTracker() {
        expenses = new ArrayList<>();
    }

    // Adds a new expense to the tracker.
    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    // Displays all expenses with a user-friendly number starting at 1.
    public void viewExpenses() {
        if (expenses.isEmpty()) {
            System.out.println("Budget is empty!");
            return;
        }

        for (int i = 0; i < expenses.size(); i++) {
            System.out.println((i + 1) + ": " + expenses.get(i));
        }
    }

    // Removes an expense using the number shown to the user.
    public boolean removeExpense(int selection) {
        int index = selection - 1;

        if (index < 0 || index >= expenses.size()) {
            return false;
        }

        expenses.remove(index);
        return true;
    }

    public boolean isEmpty() {
        return expenses.isEmpty();
    }
}